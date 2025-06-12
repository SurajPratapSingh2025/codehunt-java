package com.jdbc.connectionPooling;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Launch {
	public static void main(String[] args) {
		HikariDataSource hikariDataSource=null;
		try {
			FileInputStream fis=new FileInputStream("myConfig.properties");
			Properties properties = new Properties();
			properties.load(fis);
			
			HikariConfig hikariConfig = new HikariConfig();
			hikariConfig.setJdbcUrl((String)properties.get("mysql.url"));
			hikariConfig.setUsername((String)properties.get("mysql.user"));
			hikariConfig.setPassword((String)properties.get("mysql.pass"));
			
			hikariDataSource = new HikariDataSource(hikariConfig);
			
			Connection connection=hikariDataSource.getConnection();
			System.out.println(connection);
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
