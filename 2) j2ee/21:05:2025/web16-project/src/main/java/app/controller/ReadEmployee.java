package app.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.Service.EmployeeServiceImpl;
import app.dto.EmployeeDTO;

@WebServlet("/readEmployee")
public class ReadEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		ArrayList<EmployeeDTO> employee = employeeServiceImpl.readEmployee();
		
		request.setAttribute("data", employee);
		request.getRequestDispatcher("/WEB-INF/view/readEmployee.jsp").forward(request, response);
		
	}
}