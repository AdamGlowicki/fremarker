package com.infoshareacademy.web;

import com.infoshareacademy.freemarker.TemplateProvider;
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
import java.util.Map;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {


    @Inject
    private StudentRepository studentRepository;
    @Inject
    TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Template template = templateProvider.getTemplate(getServletContext(),"welcome-user" );

        Map <String, Object> model = new HashMap<>();
        model.put("name", "Henia");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

}
