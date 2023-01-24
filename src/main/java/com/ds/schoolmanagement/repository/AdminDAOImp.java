package com.ds.schoolmanagement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ds.schoolmanagement.entity.Admin;
import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.entity.Teacher;
import com.ds.schoolmanagement.util.AppConstant;
import com.ds.schoolmanagement.util.ConnectionUtil;

/*
 * @ author Dibakar Sarkar
 * Imp class to override implentation to AdminDao
 */

public class AdminDAOImp implements AdminDAO {
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(AppConstant.DRIVER_NAME);
			connection = DriverManager.getConnection(AppConstant.URL, "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public void saveAdmin(Admin admin) {
		try {
			String sql = "INSERT INTO admin(name,password) VALUES (?,?)";
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, admin.getName());
			ps.setString(2, admin.getPassword());
			int res = ps.executeUpdate();
			System.out.println(res);
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Admin validateAdmin(String name, String password) {
		Admin admin = null;
		try {
			Connection conn = getConnection();
			String sql = "SELECT * FROM admin WHERE name=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				admin = new Admin();
				admin.setId(resultSet.getLong(1));
				admin.setName(resultSet.getString(2));
				admin.setPassword(resultSet.getString(3));
			}
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;
	}

	@Override
	public void saveTeacher(Teacher teacher) {

		Connection connection = ConnectionUtil.getConnection();
		String sql = "INSERT INTO teacher(name, phno, Sub, sal, exp, qualification, email, classTeacher, address, password) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, teacher.getName());
			ps.setString(2, teacher.getPhno());
			ps.setString(3, teacher.getSubject());
			ps.setLong(4, teacher.getSal());
			ps.setString(6, teacher.getQualification());
			ps.setString(7, teacher.getEmail());
			ps.setString(8, teacher.getClassTeacher());
			ps.setString(9, teacher.getAddress());
			ps.setString(10, teacher.getPassword());
			int res = ps.executeUpdate();
			System.out.println(res);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveStudent(Student student) {
		Connection conn = getConnection();
		String sql = "Insert into student(name, email, phno, address,grades, standard,parent_cno,password) "
				+ "values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPhno());
			ps.setString(4, student.getAddress());
			ps.setString(5, student.getGrades());
			ps.setString(6, student.getStandard());
			ps.setString(7, student.getParentPhno());
			ps.setString(8, student.getPassword());

		} catch (SQLException e) {

		}
	}

	@Override
	public void updateStudent(Student student) {
		Connection conn = getConnection();

	}

	@Override
	public void updateTeacher(Teacher teacher) {
		
		
	}

	@Override
	public void deleteTeacher(Long id) {
		Connection con = getConnection();
		String query = "DELETE FROM teacher where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, id);
			int n = ps.executeUpdate();
			System.out.println(n + " no of rows deleted");
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent(Long id) {
		Connection con = getConnection();
		String query = "DELETE FROM student where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, id);
			int n = ps.executeUpdate();
			System.out.println(n + " no of rows deleted");
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Teacher viewTeacherById(Long id) {
		Teacher teacher = null;
		Connection con = getConnection();
		String query = "SELECT * FROM teacher WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet set = ps.executeQuery();
			if (set.next()) {
				teacher = new Teacher();
				teacher.setId(set.getLong(1));
				teacher.setName(set.getString(2));
				teacher.setEmail(set.getString(3));
				teacher.setPhno(set.getString(4));
				teacher.setSubject(set.getString(5));
				teacher.setSal(set.getLong(6));
				teacher.setExp(set.getDouble(7));
				teacher.setQualification(set.getString(8));
				teacher.setClassTeacher(set.getString(9));
				teacher.setAddress(set.getString(10));
				teacher.setPassword(set.getString(11));
				System.out.println("Teacher Object Returned");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teacher;
		
		
	}

	@Override
	public Student viewStudentById(Long id) {
		Student student = null;
		Connection con = getConnection();
		String query = "SELECT * FROM student WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet set = ps.executeQuery();
			if (set.next()) {
				student = new Student();
				student.setId(set.getLong(1));
				student.setName(set.getString(2));
				student.setEmail(set.getString(3));
				student.setPhno(set.getString(4));
				student.setAddress(set.getString(5));
				student.setGrades(set.getString(6));
				student.setStandard(set.getString(7));
				student.setParentPhno(set.getString(7));
				student.setPassword(set.getString(9));
				System.out.println("Student Object Returned");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Teacher> viewAllTeacher() {
		List<Teacher> list = new ArrayList<Teacher>();
		Connection con = getConnection();
		String query = "SELECT * FROM teacher";
		try {
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(query);
			while (set.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(set.getLong(1));
				teacher.setName(set.getString(2));
				teacher.setEmail(set.getString(3));
				teacher.setPhno(set.getString(4));
				teacher.setSubject(set.getString(5));
				teacher.setSal(set.getLong(6));
				teacher.setExp(set.getDouble(7));
				teacher.setQualification(set.getString(8));
				teacher.setClassTeacher(set.getString(9));
				teacher.setAddress(set.getString(10));
				teacher.setPassword(set.getString(11));
				list.add(teacher);
				System.out.println("Teacher Added");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Student> viewAllStudent() {
		
		List<Student> list = new ArrayList<Student>();
		String query = "SELECT * FROM student";
		Connection con = getConnection();
		try {
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(query);
			while (set.next()) {
				Student student = new Student();
				student.setId(set.getLong(1));
				student.setName(set.getString(2));
				student.setEmail(set.getString(3));
				student.setPhno(set.getString(4));
				student.setAddress(set.getString(5));
				student.setGrades(set.getString(6));
				student.setStandard(set.getString(7));
				student.setParentPhno(set.getString(8));
				student.setPassword(set.getString(9));
				list.add(student);
				System.out.println("Student Object Added");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
}
