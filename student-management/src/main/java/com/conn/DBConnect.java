package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn = null;
	
	public static Connection getConn() {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
	         Class.forName("org.postgresql.Driver");
	         
	         
			
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/students_db","postgres", "ani24");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
