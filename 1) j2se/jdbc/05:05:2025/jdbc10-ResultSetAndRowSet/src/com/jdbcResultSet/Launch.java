package com.jdbcResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Launch {
	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbc1";
		String user="root";
		String pass="rootsystem";
		
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String sql="select * from mydata";
		PreparedStatement ps=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString("ename");
			if(name.equals("raju")) {
				rs.deleteRow();
			}
		}

		dataFactory(rs);
	}
	
	private static void dataFactory(ResultSet rs) throws Exception{
		rs.beforeFirst();
		while(rs.next()) {
			System.out.println("From New Method: "+rs.getString("ename"));
		}
	}
	
}
