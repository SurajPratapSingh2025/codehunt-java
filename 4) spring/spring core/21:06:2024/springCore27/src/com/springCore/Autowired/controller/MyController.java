package com.springCore.Autowired.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springCore.Autowired.dto.StudentDTO;
import com.springCore.Autowired.service.MyService;

@Controller
public class MyController {
		private MyService myService;
		
		@Autowired
		public void setMyService(MyService myService) {
			this.myService=myService;
		}
		
		public void doPost(StudentDTO dto) {
			myService.myServiceSaveImpl(dto);
			System.out.println(myService.myServiceReadImpl());
		}
}
