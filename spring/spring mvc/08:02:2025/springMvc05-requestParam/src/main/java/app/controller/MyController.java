package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")	//optional
public class MyController {
	
	@GetMapping("insert")
	public String insertView() {
		
		return "insert";
	}
	
//	@PostMapping("insert")
//	public String insertData(HttpServletRequest request) {			//manual working
//		
//		String id=request.getParameter("id");
//		String name=request.getParameter("name");
//		
//		System.out.println(id+"-"+name);
//		return "insert";
//	}
	
//	@PostMapping("insert")
//	public String insertData(@ModelAttribute Employee emp) {		//for all dto data
//		
//		System.out.println(emp.getId()+"-"+emp.getName());
//		return "insert";
//	}
	
	@PostMapping("insert")
	public String insertData(@RequestParam("id") int id) {						//for single dto data
		
		System.out.println(id);
		return "insert";
	}
}
