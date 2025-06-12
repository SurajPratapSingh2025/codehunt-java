package com.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Student;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String welcomeView(Model model) {
		
		System.out.println("My Welcome Page");
		
		String message="xData Send Successfully";
		model.addAttribute("msg",message);
		
		model.addAttribute("age",19);
		
		//list
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("raju");
		arrayList.add("mohan");
		arrayList.add("ajay");
		model.addAttribute("mycoll",arrayList);
		
		
		
		Student s1 = new Student(11,"raju","csk");
		Student s2 = new Student(12,"kaju","mi");
		Student s3 = new Student(13,"maju","kkr");
		Student s4 = new Student(14,"paju","rcb");
		Student s5 = new Student(15,"saju","dc");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		model.addAttribute("mystdcoll",al);
		
		//switch
		int switchValue=2;
		model.addAttribute("sw",switchValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return "index";
	}
}
