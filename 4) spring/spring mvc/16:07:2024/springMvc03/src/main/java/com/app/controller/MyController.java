package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
//	@GetMapping("/")
//	@GetMapping(path= {"/","index","welcome"})
	@RequestMapping(path= {"/","index","welcome"}, method=RequestMethod.GET)
	public String welcomeView() {
		return "index";
	}
	
	@PostMapping("save")
	public String getData(HttpServletRequest request) {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		System.out.println(name+" "+age);
		return "home";
	}
	
	
	
}


