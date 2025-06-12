package app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.Service.EmployeeService;
import app.Service.EmployeeServiceImpl;
import app.dto.EmployeeDTO;
@WebServlet(urlPatterns = {"/viewAddEmployee","/addEmployee"})
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/addEmployee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");
		
		EmployeeDTO employeeDTO = new EmployeeDTO(name, address, Integer.parseInt(age), Integer.parseInt(salary));
		EmployeeService employeeService=new EmployeeServiceImpl();
		String result = employeeService.addEmployee(employeeDTO);
		
		request.setAttribute("msg", result);
		request.getRequestDispatcher("/WEB-INF/view/addEmployee.jsp").forward(request, response);
		
	}
}










//
//
//package com.dto;
//public class EmployeeDTO {
//	
//	private String name;
//	private String address;
//	private int age;
//	private int salary;
//	
//	public EmployeeDTO() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public EmployeeDTO(String name, String address, int age, int salary) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.age = age;
//		this.salary = salary;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "EmployeeDTO [name=" + name + ", address=" + address + ", age=" + age + ", salary=" + salary + "]";
//	}
//
//}












