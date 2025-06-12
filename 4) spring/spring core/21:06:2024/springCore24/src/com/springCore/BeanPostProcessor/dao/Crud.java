package com.springCore.BeanPostProcessor.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import com.springCore.BeanPostProcessor.dto.StudentDTO;
import com.springCore.BeanPostProcessor.model.Student;

public class Crud {
	private List<Student> list;
	public List<Student> getList(){
		return list;
	}
	
	@PostConstruct
	public void myCrudInit() {
		Scanner obj=new Scanner(System.in);
		System.out.println("P1->ArrayList\nP2->LinkedList");
		System.out.print("Enter Choice: ");
		int choice=obj.nextInt();
		if(choice==1) {
			list=new ArrayList<Student>();
		}else {
			list=new LinkedList<Student>();
		}
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
