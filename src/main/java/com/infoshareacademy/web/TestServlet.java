package com.infoshareacademy.web;

import com.infoshareacademy.repository.StudentRepository;

import java.io.IOException;
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

    @Override
    public void init() throws ServletException {
        System.out.println("servlwt gotowy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException {

        int size = studentRepository.getStudents().size();
        resp.getWriter().println("Nnumber of students: " + size);
    }
}
