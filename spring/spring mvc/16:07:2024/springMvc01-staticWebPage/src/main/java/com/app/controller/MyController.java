package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@PostMapping("save")
	public String getData(HttpServletRequest request) {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		System.out.println(name+" "+age);
		return "home";
	}
	
	
	
}


