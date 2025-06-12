package com.app.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.entity.EmployeeDTO;
import com.app.service.MyService;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	
	@GetMapping("index")
	public String welcomeView() {
		
		return "index";
	}
	
	@GetMapping("insert")
	public String insertView() {
		
		return "insert";
	}
	
	
	@InitBinder
	public void initBinding(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("myfile");	//excluding myfile binding
	}
	
	
	
	@PostMapping("insert")
	public String insertData(@Valid @ModelAttribute("emp") EmployeeDTO emp,BindingResult bindingResult,Model model,@RequestParam("myfile") MultipartFile multipartFile) {
		
		List<String> errorList=new ArrayList<>();
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> list = bindingResult.getAllErrors();
//			list.forEach(n->System.out.println(n));
			for(ObjectError oe:list) {
				String defaultMessage = oe.getDefaultMessage();
				System.out.println(defaultMessage);
				errorList.add(defaultMessage);
			}
			model.addAttribute("errorList",errorList);
		}
		else {
			//service DTO
//			String originalFilename = multipartFile.getOriginalFilename();
//			System.out.println(originalFilename);
//			emp.setMyfile(originalFilename);
			
			
			String result=null;
			try {
				result = myService.insertData(emp, multipartFile);
				model.addAttribute("errorList",result);
			} catch (Exception e) {
				model.addAttribute("errorList","FAILED**");
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println(emp);
		
		return "insert";
	}
	
	
	@GetMapping("read")
	public String readView(Model model) {
		
		model.addAttribute("readData",myService.read());
		
		return "read";
	}
	
	
	@GetMapping("delete")
	public String deleteData(@RequestParam int id,RedirectAttributes redirectAttributes) {
		
		redirectAttributes.addFlashAttribute("deleteData",myService.delete(id));
		return "redirect:read";
	}
	
	
}
