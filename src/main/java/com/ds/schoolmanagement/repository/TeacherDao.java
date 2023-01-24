package com.ds.schoolmanagement.repository;

import com.ds.schoolmanagement.entity.Teacher;

public interface TeacherDao {
	public void saveTeacher(Teacher teacher);
	public Teacher validateTeacher(String name, String password);

}
