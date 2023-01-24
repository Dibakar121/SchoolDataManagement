package com.ds.schoolmanagement.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ds.schoolmanagement.entity.Notic;
import com.ds.schoolmanagement.util.ConnectionUtil;

public class NoticDAO {
	public void saveNotice(Notic notic) throws ClassNotFoundException {
		Connection connection =ConnectionUtil.getConnection();
		String sql="INSERT INTO notic(subject, message, producedBy, rsvp) "
				+ "VALUES(?,?,?,?)";
		try {
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setString(1, notic.getSubject());
			ps.setString(2, notic.getMessage());
			ps.setString(3, notic.getProducedBy());
			ps.setString(4, notic.getRsvp());
			
			
			int res=ps.executeUpdate();
			System.out.println(res);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  {
		Notic notic = new Notic();
		
		notic.setSubject("Advanced Java");
		notic.setMessage("Advance Java i.e. JEE (Java Enterprislient-Server architecture for Web Apploesn’t support.\r\n"
				+ "J2EE is platform Independent, Java Centric environment for developing, building & deploying Web-based ap"
				+ "plications online. It also consists of a set of services,g multi-tiered, web-based applications.\r\n"
				+ "You will be able to work with Web and Application Srotocol. But, in Core Java, it is not possible.\r\n"
				+ "There are a lot of Advance Java frameworks like Spring, JSF, Struts o d"
				+ "with core and advanced Java concepts.");
		notic.setProducedBy("Abhijit");
		notic.setRsvp("ravish");
		
		
		NoticDAO dao= new NoticDAO();
		try {
			dao.saveNotice(notic);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
