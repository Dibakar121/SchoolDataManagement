package com.ds.schoolmanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.service.StudentService;
import com.ds.schoolmanagement.service.StudentServiceImp;
@WebServlet("/studentLogin")
public class ValidateStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService studentService = new StudentServiceImp();
		Student student = studentService.validateStudent(req.getParameter("name"), req.getParameter("password"));
		if (student != null) {
			HttpSession session = req.getSession();
			session.setAttribute("student", student);
			resp.sendRedirect("StudentAccess.jsp");
		} else {
			resp.sendRedirect("Dead.jsp");
		}
	}
}
