package com.jdbc.properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class Launch {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Connection con=null;
		try {
			while(true) {
				FileInputStream fis=new FileInputStream("myConfig.properties");
				Properties properties = new Properties();
				properties.load(fis);
				
				String url=(String)properties.get("mysql.url");
				String user=(String)properties.get("mysql.user");
				String pass=(String)properties.get("mysql.pass");
				
				Connection connection=DriverManager.getConnection(url,user,pass);
				System.out.println(connection+"->"+connection.getCatalog());
				Thread.sleep(2000);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
