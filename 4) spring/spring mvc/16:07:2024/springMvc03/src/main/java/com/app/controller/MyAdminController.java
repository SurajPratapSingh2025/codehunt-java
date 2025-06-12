package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin")
public class MyAdminController {
	
	@RequestMapping(path= {"/","index","welcome"}, method=RequestMethod.GET)
	public String welcomeView() {
		
		System.out.println("FROM ADMIN");
		return "index";
	}
}
