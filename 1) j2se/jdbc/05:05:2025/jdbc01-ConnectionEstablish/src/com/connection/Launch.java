package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Launch {
	
	public static void main(String[] args) {
		
		try {
			//MySQL Driver Loaded & Registered
//			Class.forName("com.mysql.cj.jdbc.Driver");		//jdbc 4.0+ is optional
			String url="jdbc:mysql://localhost:3306";
			String username="root";
			String password="rootsystem";
			
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}