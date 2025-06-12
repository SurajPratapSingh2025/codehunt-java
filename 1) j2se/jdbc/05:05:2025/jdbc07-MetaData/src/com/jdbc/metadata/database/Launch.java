package com.jdbc.metadata.database;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
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
			DatabaseMetaData metaData=con.getMetaData();
			
			String url2=metaData.getURL();
			System.out.println(url2);
			
			String userName2=metaData.getUserName();
			System.out.println(userName2);
			
			String databaseProductName = metaData.getDatabaseProductName();
			String databaseProductVersion = metaData.getDatabaseProductVersion();
			int databaseMinorVersion = metaData.getDatabaseMinorVersion();
			int databaseMajorVersion = metaData.getDatabaseMajorVersion();
			
			System.out.println(databaseProductName);
			System.out.println(databaseProductVersion);
			System.out.println(databaseMinorVersion);
			System.out.println(databaseMajorVersion);
			System.out.println("**********************");
			
			String driverName = metaData.getDriverName();
			String driverVersion = metaData.getDriverVersion();
			int driverMinorVersion = metaData.getDriverMinorVersion();
			int driverMajorVersion = metaData.getDriverMajorVersion();
			
			System.out.println(driverName);
			System.out.println(driverVersion);
			System.out.println(driverMinorVersion);
			System.out.println(driverMajorVersion);
			System.out.println("**********************");
			
			int maxUserNameLength=metaData.getMaxUserNameLength();
			System.out.println(maxUserNameLength);
			
			int maxcolumnsInTable=metaData.getMaxColumnsInTable();
			System.out.println(maxcolumnsInTable);
			
			int maxRowSize = metaData.getMaxRowSize();
			System.out.println(maxRowSize);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
