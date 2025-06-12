package com.jdbc.callableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/jdbc1";
			String username="root";
			String password="rootsystem";
			
			con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(false);
			
			String sql="update employee set salary=? where username='pinki' ";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			
			System.out.println("enter new salary: ");	//1000
			preparedStatement.setInt(1, scanner.nextInt());
			int executeUpdate1=preparedStatement.executeUpdate();
			System.out.println(executeUpdate1);
			
			System.out.println("enter new salary: ");	//2000
			preparedStatement.setInt(1, scanner.nextInt());
			int executeUpdate2=preparedStatement.executeUpdate();
			System.out.println(executeUpdate2);
			
			
			System.out.println("enter new salary: ");	//3000
			preparedStatement.setInt(1, scanner.nextInt());
			int executeUpdate3=preparedStatement.executeUpdate();
			System.out.println(executeUpdate3);
			
			con.commit();
			
		}
		catch(Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
