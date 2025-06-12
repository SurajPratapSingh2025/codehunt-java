package com.app.controller.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDTO;

@Service
public class MyService {
	private static List<EmployeeDTO> arrayList;
	static {
		arrayList=new ArrayList<>();
		EmployeeDTO employeeDTO1=new EmployeeDTO(11,"RAJU","ADD1",9000);
		EmployeeDTO employeeDTO2=new EmployeeDTO(12,"KAJU","ADD2",8000);
		EmployeeDTO employeeDTO3=new EmployeeDTO(13,"MAJU","ADD3",7000);
		
		
		arrayList.add(employeeDTO1);
		arrayList.add(employeeDTO2);
		arrayList.add(employeeDTO3);
		
	}

	public String testRead() {
		return "SUCCESS";
	}

	public String insert(EmployeeDTO employeeDTO) {
		return "EXISTS";
		
	}

//	public List<String> read() {
//		return Arrays.asList("abc","pqrs","ijk");
//	}
	
	public List<EmployeeDTO> read() {
		return arrayList;
	}
	
	
	public String fullUpdate(int id, EmployeeDTO dto) {
	    

	    String check = "NOT_FOUND";
	    int index = 0;
	    for (EmployeeDTO employeeDTO : arrayList) {
	        if (employeeDTO.getId() == id) {
	            arrayList.set(index, dto);
	            check = "UPDATED";
	            break;
	        }
	        index++;
	    }
	    return check;
	}

	public String partialUpdate(int id, int salary) {
		String check="NOT_FOUND";
		int index=0;
		for(EmployeeDTO employeeDTO : arrayList) {
			 if (employeeDTO.getId() == id) {
		            employeeDTO.setSalary(salary);
		            check = "UPDATED";
		            break;
		        }
		        index++;
		    }
		    return check;
	}
	
	
	
	
	
}
