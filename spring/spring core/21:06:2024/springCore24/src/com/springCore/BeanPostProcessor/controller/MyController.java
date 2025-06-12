package com.springCore.BeanPostProcessor.controller;

import com.springCore.BeanPostProcessor.dto.StudentDTO;
import com.springCore.BeanPostProcessor.service.MyService;

public class MyController {
		private MyService myService;
		
		public void setMyService(MyService myService) {
			this.myService=myService;
		}
		
		public void doPost(StudentDTO dto) {
			myService.myServiceSaveImpl(dto);
			System.out.println(myService.myServiceReadImpl());
		}
}
