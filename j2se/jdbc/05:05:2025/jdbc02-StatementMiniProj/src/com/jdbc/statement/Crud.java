package com.jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Crud {
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	
	public Crud() {
		createTable();
	}
	
	public void createTable() {
		try {
			connection=ConnectionFactory.getConnection();
			String sql="create table if not exists employee(sn INT AUTO_INCREMENT PRIMARY KEY,"
					+ "USERNAME varchar(30) NOT NULL UNIQUE,"
					+"PASSWORD varchar(30),"
					+"FULLNAME varchar(50),"
					+"ADDRESS varchar(100),"
					+"SALARY int)";
			statement=connection.createStatement();
			statement.execute(sql);
			System.out.println("Table Created");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(statement);
			ConnectionFactory.close(connection);
		}
		
		// U want to use the connection
		
	}
	
	public void insert(EmployeeDTO employeeDTO) {
		
		
		try {
			String sql="insert into employee(username,password,fullname,address,salary) "
					+"values('"+employeeDTO.getUsername()+"','"+employeeDTO.getPassword()+"','"+employeeDTO.getFullname()+"','"+employeeDTO.getAddress()+"',"+employeeDTO.getSalary()+")";
			
			connection=ConnectionFactory.getConnection();
			statement=connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("DATA INSERTED");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(statement);
			ConnectionFactory.close(connection);
		}
	}
	public void read(String username,String password) {
		try {
			String sql="Select * from employee where username='"+username+"' and password='"+password+"' ";
			
			connection=ConnectionFactory.getConnection();
			statement=connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()) {
				
				int getSn = resultSet.getInt("sn");
				String getUsername = resultSet.getString("username");
				String getPassword = resultSet.getString("password");
				String getFullname = resultSet.getString("fullname");
				String getAddress = resultSet.getString("address");
				int getSalary = resultSet.getInt("salary");
				
				
				System.out.println("SN: "+getSn);
				System.out.println("USERNAME: "+getUsername);
				System.out.println("PASSWORD: "+getPassword);
				System.out.println("FULLNAME: "+getFullname);
				System.out.println("ADDRESS: "+getAddress);
				System.out.println("SALARY: "+getSalary);
				
				
			}
			else {
				System.out.println("USER NOT FOUND");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(resultSet);
			ConnectionFactory.close(statement);
			ConnectionFactory.close(connection);
		}
		
	}
	public void update(String username,int salary) {
		
		try {
			String sql="update employee set salary="+salary+" where username='"+username+"' ";
			
			connection=ConnectionFactory.getConnection();
			statement=connection.createStatement();
			int executeUpdate = statement.executeUpdate(sql);
			if(executeUpdate > 0) {
				System.out.println("DATA UPDATED");
			}
			else {
				System.out.println("User Not Found");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(statement);
			ConnectionFactory.close(connection);
		}
		
	}
	public void delete(String username) {
		try {
			String sql="delete from employee where username='"+username+"' ";
			
			connection=ConnectionFactory.getConnection();
			statement=connection.createStatement();
			int executeUpdate = statement.executeUpdate(sql);	//no data
			if(executeUpdate > 0) {
				System.out.println("DATA DELETED");
			}
			else {
				System.out.println("User Not Found");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(statement);
			ConnectionFactory.close(connection);
		}
	}
}
