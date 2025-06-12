package app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String data = (String) session.getAttribute("data");
		
		if(data!=null) {
			request.getRequestDispatcher("/WEB-INF/view/home.jsp").include(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("sps") && password.equals("sps123")) {
			
			//for session store
			HttpSession session = request.getSession(); // session hr ek browser k liye banega
			session.setAttribute("data", password);
			request.getRequestDispatcher("/WEB-INF/view/home.jsp").include(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
		
	}

}
