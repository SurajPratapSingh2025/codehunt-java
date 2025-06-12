package app.Service;

import java.util.ArrayList;

import app.dto.EmployeeDTO;

public interface EmployeeService {
	
	String addEmployee(EmployeeDTO employeeDTO);
	
	ArrayList<EmployeeDTO> readEmployee();

}