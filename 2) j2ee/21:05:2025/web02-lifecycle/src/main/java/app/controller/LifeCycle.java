package app.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
//@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	
	static {
		System.out.println("Servlet Loading");
	}
    public LifeCycle() {
       System.out.println("Servlet Instantiating");
    }
    public void init(ServletConfig config) throws ServletException{
    	System.out.println("Resource Allocation");
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service");
	}
	public void destroy() {
		System.out.println("Resource Deallocation");
	}
}
