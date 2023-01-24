package com.ds.schoolmanagement.service;

import com.ds.schoolmanagement.entity.Teacher;
import com.ds.schoolmanagement.repository.TeacherDAOImp;
import com.ds.schoolmanagement.repository.TeacherDao;

public class TeacherServiceImp implements TeacherService {
	public TeacherDao teacherDao;
	
	public TeacherServiceImp() {
		teacherDao=new TeacherDAOImp();
		
		
	}
	public void saveTeacher(Teacher teacher ) {
		teacherDao.saveTeacher(teacher);
	}
	
	@Override
	public Teacher validateTeacher(String name, String password) {
		// TODO Auto-generated method stub
		return teacherDao.validateTeacher(name, password);
	}
	

}
