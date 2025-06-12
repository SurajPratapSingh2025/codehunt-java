package app.dao;

import java.util.ArrayList;

import app.dto.EmployeeDTO;

public interface EmployeeDAO {
	
	void createTable();
	String addEmployee(EmployeeDTO employeeDTO);
	ArrayList<EmployeeDTO> readEmployee();
 
}