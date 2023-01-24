package com.ds.schoolmanagement.repository;

import com.ds.schoolmanagement.entity.Student;

public interface StudentDao {
	
	public void saveStudent(Student student);

	public Student validateStudent(String name, String password);

}
