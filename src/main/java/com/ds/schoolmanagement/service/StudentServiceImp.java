package com.ds.schoolmanagement.service;

import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.repository.StudentDAOImp;
import com.ds.schoolmanagement.repository.StudentDao;

public  class StudentServiceImp implements  StudentService {
	public StudentDao studentDao;
	
	public StudentServiceImp() {
		studentDao=new StudentDAOImp();
	}
	
	public void saveStudent(Student student ) {
		studentDao.saveStudent(student);
	}


	@Override
	public Student validateStudent(String name, String password) {
		// TODO Auto-generated method stub
		return studentDao.validateStudent(name, password);
	}

}
