package app.Service;

import java.util.ArrayList;

import app.dao.EmployeeDAOImpl;
import app.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		
		//DATA PROCESSING LIKE VALIDATION
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		return employeeDAOImpl.addEmployee(employeeDTO);
	}

	@Override
	public ArrayList<EmployeeDTO> readEmployee() {
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		return employeeDAOImpl.readEmployee();
	}
}
