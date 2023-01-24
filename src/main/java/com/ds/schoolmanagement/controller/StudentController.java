package com.ds.schoolmanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.service.StudentServiceImp;

@WebServlet("/saveStudent")
public class StudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		String address = req.getParameter("address");
		String grades = req.getParameter("grades");
		String standard = req.getParameter("standard");
		String parent_cno = req.getParameter("parent_cno");
		String password = req.getParameter("password");

		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPhno(phno);
		student.setAddress(address);
		student.setGrades(grades);
		student.setStandard(standard);
		student.setParentPhno(parent_cno);
		student.setPassword(password);

		StudentServiceImp studentService = new StudentServiceImp();
		studentService.saveStudent(student);
	}

}
