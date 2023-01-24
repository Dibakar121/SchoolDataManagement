package com.ds.schoolmanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.entity.Teacher;
import com.ds.schoolmanagement.service.TeacherServiceImp;

@WebServlet("/saveTeacher")
public class TeacherControll extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String phno = req.getParameter("phno");
		String sub = req.getParameter("subject");
		Long sal = req.getParameter("salary")== null? 0 : Long.parseLong(req.getParameter("salary"));
		Double exp = req.getParameter("experince")== null? 0 : Double.parseDouble(req.getParameter("experince"));
		String qualification = req.getParameter("qualification");
		String email = req.getParameter("email");
		String classTeacher = req.getParameter("classTeacher");
		String address = req.getParameter("address");
		String password = req.getParameter("password");

		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setPhno(phno);
		teacher.setSubject(sub);
		teacher.setSal(sal);
		teacher.setExp(exp);
		teacher.setQualification(qualification);
		teacher.setEmail(email);
		teacher.setClassTeacher(classTeacher);
		teacher.setAddress(address);
		teacher.setPassword(password);
		
		TeacherServiceImp studentService=new TeacherServiceImp();
		studentService.saveTeacher(teacher);
	}

}
