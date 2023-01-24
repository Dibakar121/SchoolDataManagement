package com.ds.schoolmanagement.service;

import com.ds.schoolmanagement.entity.Admin;

public interface AdminService {
	public void saveAdmin(Admin admin);
	public Admin validateAdmin(String name, String Password);
}
