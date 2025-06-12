package app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")	//optional
public class MyController {
	
	@GetMapping("insert")
	public String insertView() {
		
		return "insert";
	}
	
	@PostMapping("insert")
	public String insertData(HttpServletRequest request) {
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		
		System.out.println(id+"-"+name);
		return "insert";
	}
	
}
