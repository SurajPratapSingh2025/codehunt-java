package com.jdbcRowSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Launch {
	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbc1";
		String user="root";
		String pass="rootsystem";
		
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String sql="select * from mydata";
		PreparedStatement ps=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=ps.executeQuery();
		
		
		CachedRowSet crs=RowSetProvider.newFactory().createCachedRowSet();
		crs.populate(rs);
		
		
		con.close();
		while(crs.next()) {
			String name=crs.getString("ename");
			if(name.equals("Ram")) {
				crs.deleteRow();
			}
		}

		dataFactory(crs);
	}
	
	private static void dataFactory(ResultSet crs) throws Exception{
		crs.beforeFirst();
		while(crs.next()) {
			System.out.println("From New Method: "+crs.getString("ename"));
		}
	}
	
}
