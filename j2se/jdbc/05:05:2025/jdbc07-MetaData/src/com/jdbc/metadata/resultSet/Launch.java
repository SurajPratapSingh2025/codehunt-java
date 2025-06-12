package com.jdbc.metadata.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

//database metadata & resultset metadata
public class Launch {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/jdbc1";
			String username="root";
			String password="rootsystem";
			
			con=DriverManager.getConnection(url,username,password);
			
			String sql="select * from employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			ResultSetMetaData metaData = resultSet.getMetaData();
			
			int columnCount=metaData.getColumnCount();
			System.out.println(columnCount);
			
			for(int i=1; i<=columnCount; i++) {
				String columnName=metaData.getColumnName(i);
				System.out.println(columnName);
				
			}
			
			for(int i=1; i<=columnCount; i++) {
				String columnName=metaData.getColumnClassName(i);
				System.out.println(columnName);
			}
			
			for(int i=1; i<=columnCount; i++) {
				int size=metaData.getColumnDisplaySize(i);
				System.out.println(size);
				
			}
			
			String tableName=metaData.getTableName(1);
			System.out.println(tableName);
			
			String dbname=metaData.getCatalogName(1);
			System.out.println(dbname);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
