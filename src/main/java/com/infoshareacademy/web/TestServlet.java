package com.infoshareacademy.web;

import com.infoshareacademy.freemarker.TemplateProvider;
import com.infoshareacademy.repository.StudentRepository;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.HashMap;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test")
public class TestServlet extends HttpServlet {
    @Inject
    private StudentRepository studentRepository;
    @Inject
    private TemplateProvider templateProvider;

    @Override
    public void init() throws ServletException {
        System.out.println("servlwt gotowy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException {

//        int size = studentRepository.getStudents().size();
//        resp.getWriter().println("Nnumber of students: " + size);
//
//        String name = req.getParameter("name");
//        resp.getWriter().println("helllo" + name);

        Template template = templateProvider.getTemplate(getServletContext(),"text" );
        try {
            template.process(new HashMap<>(), resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
