package com.ds.schoolmanagement.service;

import com.ds.schoolmanagement.entity.Teacher;

public interface TeacherService {
	public void saveTeacher(Teacher teacher);
	public Teacher validateTeacher(String name, String password);

}
