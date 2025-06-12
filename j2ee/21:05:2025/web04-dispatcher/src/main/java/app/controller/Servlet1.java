package app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//when logic of one servlet is complex then we use another
//@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		System.out.println("Validation Name: "+name+" & Address: "+address);
		
//		response.sendRedirect("Servlet2");	//browser-->get(servlet)
		response.getWriter().print("Data Persistency Successfull");
		
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
//		rd.forward(request, response);	//resource take over
		rd.include(request, response);	//combined output
		
	}

}
