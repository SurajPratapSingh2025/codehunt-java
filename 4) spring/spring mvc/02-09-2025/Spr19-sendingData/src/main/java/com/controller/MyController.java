package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.StudentDto;

@Controller
public class MyController {
	
	@GetMapping("/registration")
	public String getWelcome(Model model) {
		if(!model.containsAttribute("msg")) {
			model.addAttribute("msg","this is my registration page");
		}
		return "registration";
	}
	
	//ModelAttribute
	@PostMapping("/registration")
	public String getData(@ModelAttribute StudentDto studentDto,RedirectAttributes redirectAttributes) {
		System.out.println(studentDto);
		redirectAttributes.addFlashAttribute("msg","data inserted");
		return "redirect:/dynamic/registration";
	}
	
	//RequestParam
	@GetMapping("/delete")
	public String getData(@RequestParam("id") int id,@RequestParam("name") String name) {
		System.out.println(id+"\t"+name);
		return "redirect:/dynamic/registration";
	}
	
	//PathVariable
	@GetMapping("/deleteById/{id}")
	public String getData(@PathVariable int id) {
		System.out.println(id);
		return "redirect:/index.html";
	}
		
}


