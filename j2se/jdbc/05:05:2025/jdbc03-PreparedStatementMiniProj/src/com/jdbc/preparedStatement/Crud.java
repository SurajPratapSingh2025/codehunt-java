package com.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Crud {
	Connection connection=null;
	ResultSet resultSet=null;
	PreparedStatement preparedStatement=null;
	
	public Crud() {
		createTable();
	}
	
	public void createTable() {
		Statement statement=null;
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
					+"values(?,?,?,?,?)";
			
			connection=ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);	//Query compiled
			
			int count=1;
			while(count <= 2) {
				preparedStatement.setString(1, employeeDTO.getUsername()+count);
				preparedStatement.setString(2, employeeDTO.getPassword());
				preparedStatement.setString(3, employeeDTO.getFullname());
				preparedStatement.setString(4, employeeDTO.getAddress());
				preparedStatement.setInt(5, employeeDTO.getSalary());
				
				preparedStatement.executeUpdate();
				System.out.println("DATA INSERTED");
				count++;
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
	}
	public void read(String username,String password) {
		try {
			String sql="Select * from employee where username=? and password=? ";
			
			connection=ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			resultSet = preparedStatement.executeQuery();

			
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
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
		
	}
	public void update(String username,int salary) {
		
		try {
			String sql="update employee set salary=? where username=? ";
			
			connection=ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, salary);
			preparedStatement.setString(2, username);
			
			int executeUpdate = preparedStatement.executeUpdate();
			if(executeUpdate > 0) {
				System.out.println("DATA UPDATED");
			}
			else {
				System.out.println("User Not Found");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
		
	}
	public void delete(String username) {
		try {
			String sql="delete from employee where username=? ";
			
			connection=ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, username);
			
			
			
			int executeUpdate = preparedStatement.executeUpdate();	//no data
			if(executeUpdate > 0) {
				System.out.println("DATA DELETED");
			}
			else {
				System.out.println("User Not Found");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
	}
	
	
	public void test(String sql) {	//Employee: Data Read/NonRead Operation
		try {
			
			connection=ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			boolean execute=preparedStatement.execute();
			if(execute) {
				resultSet=preparedStatement.getResultSet();
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
					System.out.println("User Not Found");
				}
			}
			else {
				int k = preparedStatement.getUpdateCount();
				System.out.println(k);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
	}
}

