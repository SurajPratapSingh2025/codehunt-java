package app.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/testservlet")
@WebServlet(
		name="myservlet",
		urlPatterns= {"/testservlet","/test","/demo"},
		initParams= {
				@WebInitParam(name="url1", value="jdbc:xyz1"),
				@WebInitParam(name="url2", value="jdbc:xyz2")
				
		}
		)
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("my name is sps.");
		ServletConfig servletConfig=getServletConfig();
		ServletContext servletContext=getServletContext();
		
		response.getWriter().print("SERVLET CALLED: "
		+servletConfig.getInitParameter("url1")
		+" : "
		+servletContext.getInitParameter("admin")
				);
		
	}
	
	
}
