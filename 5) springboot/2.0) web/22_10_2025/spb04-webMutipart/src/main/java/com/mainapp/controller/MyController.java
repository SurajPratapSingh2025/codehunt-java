package com.mainapp.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@GetMapping(path= {"welcome","home"})
	public String welcome(){
		return "index";
	}
	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute StudentDto studentDto,Model model,RedirectAttributes redirectAttributes,HttpServletRequest request) throws IllegalStateException, IOException {
		//check file null or not
		if(studentDto.getMultipartFile()==null || studentDto.getMultipartFile().isEmpty()) {
			model.addAttribute("notupload","file must be upload");
			return "registration";
		}
		//check file 1mb limit exceed
//		long size = studentDto.getMultipartFile().getSize();
//		if(size>(1*1024*1024)) {
//			model.addAttribute("fileError","file size must not exceed 1mb");
//			return "registration";
//		}
		//get path
		String realPath = request.getServletContext().getRealPath("images/");
		String originalFilename = UUID.randomUUID().toString()+LocalDateTime.now().toString().replace(":","a")+studentDto.getMultipartFile().getOriginalFilename();
		File file = Paths.get(realPath,originalFilename).toFile();
		studentDto.getMultipartFile().transferTo(file);
		
		System.out.println("**********************************");
		
		StudentEntity save = myService.save(studentDto,originalFilename);
		System.out.println(save);
		
		redirectAttributes.addFlashAttribute("msg","Data Inserted");
		return "redirect:/home";
	}
	
	
	@GetMapping("/view")
	public String view(Model model) {
		List<StudentEntity> list = myService.findall();
		System.out.println(list);
		model.addAttribute("list",list);
		return "view";
	}

	
	
	
}
