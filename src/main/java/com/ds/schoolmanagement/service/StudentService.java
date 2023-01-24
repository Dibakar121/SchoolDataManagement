package com.ds.schoolmanagement.service;

import com.ds.schoolmanagement.entity.Student;

public interface StudentService {
	public void saveStudent(Student student);
	public Student validateStudent(String parameter, String parameter2);

}
