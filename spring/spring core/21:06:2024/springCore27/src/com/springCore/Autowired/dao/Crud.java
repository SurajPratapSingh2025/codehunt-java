package com.springCore.Autowired.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springCore.Autowired.dto.StudentDTO;
import com.springCore.Autowired.model.Student;

@Repository
public class Crud {
	private List<Student> list=new ArrayList<Student>();
	public List<Student> getList(){
		return list;
	}
	
	
	public void saveMyData(StudentDTO dto) {
		Student student = new Student(dto.getSid(),dto.getSname(),dto.getSaddress(),dto.getSsalary());
		list.add(student);
		System.out.println("data inserted");
	}
	
	public List<Student> readMyData() {
		return list;
	}
}
