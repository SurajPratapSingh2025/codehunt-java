package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String URL="jdbc:mysql://localhost:3306/jdbc1";
	private static final String USERNAME="root";
	private static final String PASSWORD="rootsystem";
	
	public static Connection getConnection() {
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void close(AutoCloseable resource) {
		try {
			resource.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
