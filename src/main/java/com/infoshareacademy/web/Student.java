package com.infoshareacademy.web;

import com.infoshareacademy.freemarker.TemplateProvider;
import com.infoshareacademy.repository.StudentRepository;
import freemarker.template.Configuration;
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
import java.util.Map;

@WebServlet("/student")
public class Student extends HttpServlet {

    @Inject
    TemplateProvider templateProvider;

    @Inject
    StudentRepository studentRepository;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        Integer integer = Integer.valueOf(idStr);
        com.infoshareacademy.model.Student student = studentRepository.getById(integer);

        Map <String, Object> model = new HashMap<>();
        model.put("student", student);

        Template template = templateProvider.getTemplate(getServletContext(),"student" );
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }


}
