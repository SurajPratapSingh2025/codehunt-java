package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.application.pojo.Employee;
import com.application.service.MyService;

import jakarta.validation.Valid;

@Controller
public class MyController {
	private MyService myService;
	
	@Autowired
	public void setService(MyService myService) {
		this.myService=myService;
	}
	
	@GetMapping(path= {"/","home"})
	public String welcomeView() {
		return "index";
	}
	
	@GetMapping("insert")
	public String insertView() {
		return "insert";
	}
	
	@PostMapping("insert")
	public String insertData(@Valid @ModelAttribute Employee emp, BindingResult bindingResult,Model model,RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
//			System.out.println(bindingResult);
			List<ObjectError> list=bindingResult.getAllErrors();
			for(ObjectError oe:list) {
				System.out.println(oe.getDefaultMessage());
			}
			
			
			return "insert";
		}
		else {
			//call service(emp)
		}
		return "redirect:/insert";
	}
	
	
	
	
	
	
}
