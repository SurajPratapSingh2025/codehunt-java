package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/home.do")
	public String welcome() {
		System.out.println("home is running....");
		return "home";
	}

}
