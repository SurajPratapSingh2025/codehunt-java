package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/index")
	public String welcomeHome() {
		return "index";
	}

	@GetMapping("/admin")
	public String adminHome() {
		return "admin";
	}
	
	@GetMapping("/member")
	public String memberHome() {
		return "member";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	
	
	
	
	
	
	
	
	
}