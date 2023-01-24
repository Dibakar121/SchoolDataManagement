package com.ds.schoolmanagement.repository;

import java.util.List;

import com.ds.schoolmanagement.entity.Admin;
import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.entity.Teacher;

public interface AdminDAO {
	public void saveAdmin(Admin admin);
	public Admin validateAdmin(String name, String password);
	public void saveTeacher(Teacher teacher);
	public void saveStudent(Student student);
	public void updateStudent(Student student);
	public void updateTeacher(Teacher teacher);
	public void deleteTeacher(Long id);
	public void deleteStudent(Long id);
	public Teacher viewTeacherById(Long id);
	public Student viewStudentById(Long id);
	public List<Teacher> viewAllTeacher();
	public List<Student> viewAllStudent();

	
	
}
