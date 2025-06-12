package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.dto.EmployeeDTO;
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void createTable() {
		try {
			
			String sql="create table if not exists employee(sn int primary key auto_increment,"
					+ "name varchar(30),"
					+ "address varchar(100),"
					+ "age int,"
					+ "salary int)";
			
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			statement.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {  
		
      try {
			String sql="insert into employee(name,address,age,salary) values(?,?,?,?)";
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, employeeDTO.getName());
			ps.setString(2, employeeDTO.getAddress());
			ps.setInt(3, employeeDTO.getAge());
			ps.setInt(4, employeeDTO.getSalary());
			
			int row = ps.executeUpdate();
			if(row==1) {
				return "SAVED";
			}
			else {
				return "FAILED TO SAVED";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "FAILED TO SAVE";
		}
	}

	@Override
	public ArrayList<EmployeeDTO> readEmployee() {
		
		ArrayList<EmployeeDTO> arrayList = new ArrayList<EmployeeDTO>();
		
		try {
			String sql="select * from employee";
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				EmployeeDTO employeeDTO = new EmployeeDTO(rs.getString("name"), rs.getString("address"),
						rs.getInt("age"), rs.getInt("salary"));
				arrayList.add(employeeDTO);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			return arrayList;
		}
	}
}
