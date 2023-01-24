package com.ds.schoolmanagement.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Connection conn = null;

	private ConnectionUtil() {
	}

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(AppConstant.DRIVER_NAME);
//				FileInputStream fis = new FileInputStream("myDBinfo.properties");
//				Properties properties = new Properties();
//				properties.load(fis);
				conn = DriverManager.getConnection(AppConstant.URL, "root", "root");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();

			}
		}
		return conn;

	}
}
