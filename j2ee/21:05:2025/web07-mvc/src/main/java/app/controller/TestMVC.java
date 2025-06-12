package app.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/TestMVC")
public class TestMVC extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.sendRedirect("read.jsp");
		
		//crate temporay data & try to get
		List<String> list = Arrays.asList("emp1","emp2");
		//HttpSession used for store & session used for get data
		HttpSession session = request.getSession();
		session.setAttribute("data", list);
		
		
		
		RequestDispatcher rq = request.getRequestDispatcher("WEB-INF/view/read.jsp");
		rq.forward(request, response);
	}

}
