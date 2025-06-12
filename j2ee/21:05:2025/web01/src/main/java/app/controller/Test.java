package app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
//@WebServlet("/Test")
public class Test extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String password = request.getParameter("password");
		
		//to print on console
		System.out.println(fullname+" "+password);
		
		//to print on browser
//		PrintWriter writer = response.getWriter();
//		writer.print("<h1>SUCCESS</h>");
		
		//to redirection
		response.sendRedirect("https://www.facebook.com/");
		
	}
	

}
