package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.StudentDto;

@Controller
public class MyController {
	
	@GetMapping("/registration.do")
	public String getWelcome() {
		System.out.println("........... view connect ..........");
		return "registration";
	}
	
//	@PostMapping("/registration.do")
//	public String getData(HttpServletRequest request) {
//		int rollno = Integer.parseInt(request.getParameter("rollno"));
//		String fullname = request.getParameter("fullname");
//		String course = request.getParameter("course");
//		float fee = Float.parseFloat(request.getParameter("fee"));
//		String college = request.getParameter("college");
//		String address = request.getParameter("address");
//		StudentDto studentDto = new StudentDto(rollno,fullname,course,fee,college,address);
//		System.out.println(studentDto);
//		return "registration";
//	}
	
	//ModelAttribute
	@PostMapping("/registration.do")
	public String getData(@ModelAttribute StudentDto studentDto) {
		System.out.println(studentDto);
		return "redirect:/registration.do";
	}
	
	//RequestParam
	@GetMapping("/delete.do")
	public String getData(@RequestParam("id") int id,@RequestParam("name") String name) {
		System.out.println(id+"\t"+name);
		return "redirect:/registration.do";
	}
	
	
	
	
}
