package com.jdbc.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Launch {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/jdbc1";
			String username="root";
			String password="rootsystem";
			
			Connection con=DriverManager.getConnection(url,username,password);
			CallableStatement callableStatement = con.prepareCall("{CALL xyz(?,?)}");
			// in mysql
//			CREATE DEFINER=`root`@`localhost` PROCEDURE `xyz`(in getname varchar(10), in getsalary int)
//				BEGIN
//					select * from employee where fullname like getname and salary > getsalary;
//				END
//			call xyz('p%',2000);
			callableStatement.setString(1, "p%");
			callableStatement.setInt(2, 2000);
			
			ResultSet rs=callableStatement.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("fullname"));
				System.out.println(rs.getInt("salary"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
