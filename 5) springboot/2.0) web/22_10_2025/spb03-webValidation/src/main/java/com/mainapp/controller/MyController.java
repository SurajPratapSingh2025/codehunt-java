package com.mainapp.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mainapp.dto.StudentDto;
import com.mainapp.entity.StudentEntity;
import com.mainapp.service.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping(path={"/welcome","/home"})
	public String welcome(Model model) {
//		if(!model.containsAttribute("msg")) {
//			model.addAttribute("msg","this is my welocome page");
//		}
		return "index";
	}
	
	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute StudentDto studentDto,BindingResult bindingResult,Model model,RedirectAttributes redirectAttributes) {
		List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//		for(FieldError e:fieldErrors) {
//			if(e.getField().equals("fullname")) {
//				System.out.println(e.getDefaultMessage());
//			}
//		}
		if(bindingResult.hasErrors()) {
			model.addAttribute("errors", fieldErrors);
			return "registration";
		}
		
		StudentEntity save = myService.save(studentDto);	//controller => service
		System.out.println(save);		//console print
		redirectAttributes.addFlashAttribute("msgRegistration", "Data Inserted");
		return "redirect:/registration";
	}
	
	@GetMapping("/readAll")
	public String readAll(Model model) {
		List<StudentEntity> list = myService.findAll();
		for(StudentEntity e:list) {
			System.out.println(e);		//console print
		}
		model.addAttribute("students",list);
		model.addAttribute("msgRead","View Data");
		return "readAll";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginDone(int rollno,RedirectAttributes redirectAttributes) {
		Optional<StudentEntity> id = myService.findById(rollno);
		System.out.println(id);
		redirectAttributes.addFlashAttribute("msgLogin", "Data Avaiable");
		return "redirect:/home";
	}
	
	
	@GetMapping("/deleteAll")
	public String deleteAll(RedirectAttributes redirectAttributes) {
		myService.deleteAll();
		System.out.println("Data Deleted");
		redirectAttributes.addFlashAttribute("msgDelete", "Data Deleted");
		return "redirect:/home";
	}
	
	@GetMapping("/deleteById")
	public String deleteById() {
		return "deleteById";
	}
	
	@PostMapping("/deleteById")
	public String deleteById(int rollno,RedirectAttributes redirectAttributes) {
		myService.deleteById(rollno);
		System.out.println("Data Deleted");		//console print
		redirectAttributes.addFlashAttribute("msgDeleteById", "Data Deleted by Id");
		return "redirect:/deleteById";
	}
	
	
	
	
}
