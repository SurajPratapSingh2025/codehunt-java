package com.jdbc.batchOperation;

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
			System.out.println(con);
			
			String sql="insert into employee(username,password,fullname,address,salary) values(?,?,?,?,?)";
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			
			while(true) {
				System.out.println("Enter Username: ");
				String user=scanner.next();
				System.out.println("Enter Password: ");
				String pass=scanner.next();
				scanner.nextLine();
				System.out.println("Enter Fullname: ");
				String fullname=scanner.nextLine();
				System.out.println("Enter Address: ");
				String address=scanner.nextLine();
				System.out.println("Enter Salary: ");
				int salary=scanner.nextInt();
				
				preparedStatement.setString(1, user);
				preparedStatement.setString(2, pass);
				preparedStatement.setString(3, fullname);
				preparedStatement.setString(4, address);
				preparedStatement.setInt(5, salary);
				
				preparedStatement.addBatch();
				
				System.out.println("Do You want to insert More(Y/N): ");
				String choice=scanner.next().trim().toUpperCase();
				if(!choice.equals("Y")) {
					int[] i=preparedStatement.executeBatch();
//					Arrays.stream(i).forEach(n->System.out.println(n));
					System.out.println(i.length);
					con.commit();
					break;
				}
			}
			
			
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
