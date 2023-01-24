package com.ds.schoolmanagement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ds.schoolmanagement.entity.Teacher;
import com.ds.schoolmanagement.util.AppConstant;

public class TeacherDAOImp implements TeacherDao {
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
	public void saveTeacher(Teacher teacher) {
		
		try {
			Connection conn =getConnection();
			String sql="INSERT INTO teacher(name, phno, Sub, sal, exp, qualification, email, classTeacher, address, password) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, teacher.getName());
			ps.setString(2, teacher.getPhno());
			ps.setString(3, teacher.getSubject());
			ps.setLong(4, teacher.getSal());
			ps.setDouble(5, teacher.getExp());
			ps.setString(6, teacher.getQualification());
			ps.setString(7, teacher.getEmail());
			ps.setString(8, teacher.getClassTeacher());
			ps.setString(9, teacher.getAddress());
			ps.setString(10, teacher.getPassword());
			
			
			int res=ps.executeUpdate();
			System.out.println(res);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public Teacher validateTeacher(String name, String password) {
		Teacher teacher=null;
		try {
			Connection conn = getConnection();
			String sql = "SELECT * FROM teacher WHERE name=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet resultSet =ps.executeQuery();
			if(resultSet.next()) {
				teacher=new Teacher();
				teacher.setId(resultSet.getLong(1));
				teacher.setName(resultSet.getString(2));
				teacher.setPassword(resultSet.getString(3));
			}
			ps.close();
			conn.close();			
		}catch (SQLException e) {
			e.printStackTrace();
		}		
		return teacher;
	}
	
	
	

}
