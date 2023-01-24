package com.ds.schoolmanagement.service;

import com.ds.schoolmanagement.entity.Admin;
import com.ds.schoolmanagement.repository.AdminDAO;
import com.ds.schoolmanagement.repository.AdminDAOImp;

public class AdminServiceImp implements AdminService {
	public AdminDAO adminDAO;

	public AdminServiceImp() {
		adminDAO = new AdminDAOImp();
	}
	public void saveAdmin(Admin admin) {
		//AdminDAOImp adminDAO = new AdminDAOImp();
		adminDAO.saveAdmin(admin);
	}
	@Override
	public Admin validateAdmin(String name, String Password) {
		return adminDAO.validateAdmin(name, Password);
	}

}
