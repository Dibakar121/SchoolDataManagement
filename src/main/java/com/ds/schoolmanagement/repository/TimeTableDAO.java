package com.ds.schoolmanagement.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ds.schoolmanagement.entity.TimeTable;
import com.ds.schoolmanagement.util.ConnectionUtil;

public class TimeTableDAO {
	public void saveTimeTable(TimeTable timeTable) throws ClassNotFoundException {
		Connection connection =ConnectionUtil.getConnection();
		String sql="INSERT INTO timetable(Subject, day, teacherName, standard, period) "
				+ "VALUES(?,?,?,?,?)";
		try {
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setString(1, timeTable.getSubject());
			ps.setString(2, timeTable.getDay());
			ps.setString(3, timeTable.getTeacher());
			ps.setString(4, timeTable.getStandard());
			ps.setString(5, timeTable.getPeriod());
			
			
			int res=ps.executeUpdate();
			System.out.println(res+" Row Successfully Insert");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  {
		TimeTable timeTable = new TimeTable();
		
		timeTable.setSubject("JAVA");
		timeTable.setDay("14/01/2023");
		timeTable.setTeacher("Abhijit");
		timeTable.setStandard("Advanced");
		timeTable.setPeriod("2nd");
		
		
		TimeTableDAO dao= new TimeTableDAO();
		try {
			dao.saveTimeTable(timeTable);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
