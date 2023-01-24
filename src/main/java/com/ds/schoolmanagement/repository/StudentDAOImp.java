package com.ds.schoolmanagement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ds.schoolmanagement.entity.Student;
import com.ds.schoolmanagement.util.AppConstant;

public class StudentDAOImp implements StudentDao {
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
	public void saveStudent(Student student) {
		try {
			String sql = "INSERT INTO student(name, email, phno, address, grades, standard, parent_cno, password) VALUES (?,?,?,?,?,?,?,?)";
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPhno());
			ps.setString(4, student.getAddress());
			ps.setString(5, student.getGrades());
			ps.setString(6, student.getStandard());
			ps.setString(7, student.getParentPhno());
			ps.setString(8, student.getPassword());
			int res=ps.executeUpdate();
			System.out.println(res);
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public Student validateStudent(String name, String password) {
		Student student=null;
		try {
			Connection conn = getConnection();
			String sql = "SELECT * FROM student WHERE name=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet resultSet =ps.executeQuery();
			if(resultSet.next()) {
				student=new Student();
				student.setId(resultSet.getLong(1));
				student.setName(resultSet.getString(2));
				student.setPassword(resultSet.getString(3));
			}
			ps.close();
			conn.close();			
		}catch (SQLException e) {
			e.printStackTrace();
		}		
		return student;
	}
	
}
