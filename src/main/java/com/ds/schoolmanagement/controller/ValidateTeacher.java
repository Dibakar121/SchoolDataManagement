package com.ds.schoolmanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.schoolmanagement.entity.Teacher;
import com.ds.schoolmanagement.service.TeacherService;
import com.ds.schoolmanagement.service.TeacherServiceImp;


@WebServlet("/teacherLogin")
public class ValidateTeacher extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TeacherService teacherService = new TeacherServiceImp();
		Teacher teacher = teacherService.validateTeacher(req.getParameter("name"), req.getParameter("password"));
		if (teacher != null) {
			HttpSession session = req.getSession();
			session.setAttribute("teacher", teacher);
			resp.sendRedirect("TeacherAccess.jsp");
		} else {
			resp.sendRedirect("Dead.jsp");
		}
	}

}
