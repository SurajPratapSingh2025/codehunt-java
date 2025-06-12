package app.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig servletConfig = getServletConfig();
		String s1 = servletConfig.getInitParameter("url");
		System.out.println(s1);
		
		
		ServletContext servletContext = getServletContext();
		String s2 = servletContext.getInitParameter("key");
		System.out.println(s2);
		
		//dynamically get
		String s3 = (String)servletContext.getAttribute("linking");
		System.out.println(s3);
		
		
		response.sendRedirect("index.html");
	}

}
