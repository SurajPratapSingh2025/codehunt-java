package app.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
public class ConnectionFactory {
	
	private static HikariDataSource  hikariDataSource;
	
	public static void init(String url,String user,String pass,String driver) {
		
        try {
        	Class.forName(driver);
        	HikariConfig hikariConfig = new HikariConfig();
        	hikariConfig.setJdbcUrl(url);
        	hikariConfig.setUsername(user);
        	hikariConfig.setPassword(pass);
        	
        	hikariDataSource= new HikariDataSource(hikariConfig);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return hikariDataSource.getConnection();
	}
}
