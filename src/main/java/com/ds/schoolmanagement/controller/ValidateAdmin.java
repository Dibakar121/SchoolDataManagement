package com.ds.schoolmanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.schoolmanagement.entity.Admin;
import com.ds.schoolmanagement.service.AdminService;
import com.ds.schoolmanagement.service.AdminServiceImp;

@WebServlet("/adminLogin")
public class ValidateAdmin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminService adminService = new AdminServiceImp();
		Admin admin = adminService.validateAdmin(req.getParameter("name"), req.getParameter("password"));
		if (admin != null) {
			HttpSession session = req.getSession();
			session.setAttribute("admin", admin);
			resp.sendRedirect("AdminAccess.jsp");

		} else {
			resp.sendRedirect("invalidAdmin.jsp");
		}

	}

}
