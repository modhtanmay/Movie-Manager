package com.tanmay.java.movieManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
	private static Connection conn = null;
	
	public Connection establishConnection() throws ClassNotFoundException,SQLException {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","modhtanu");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
