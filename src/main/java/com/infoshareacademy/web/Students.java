package com.infoshareacademy.web;

import com.infoshareacademy.freemarker.TemplateProvider;
import com.infoshareacademy.model.Student;
import com.infoshareacademy.repository.StudentRepository;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/students")
public class Students extends HttpServlet {

    @Inject
    TemplateProvider templateProvider;
    @Inject
    StudentRepository studentRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> students = studentRepository.getStudents();

        Map<String, Object> model = new HashMap<>();
        model.put("students", students);

        Template template = templateProvider.getTemplate(getServletContext(),"students" );
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

}
