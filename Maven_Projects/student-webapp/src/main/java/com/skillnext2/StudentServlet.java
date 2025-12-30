package com.skillnext2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Student Servlet is WORKING</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String branch = req.getParameter("branch");
        String email = req.getParameter("email");

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setBranch(branch);
        stu.setEmail(email);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}
