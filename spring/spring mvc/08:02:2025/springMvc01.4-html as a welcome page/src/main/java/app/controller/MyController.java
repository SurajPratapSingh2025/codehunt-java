package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
//	@GetMapping("save")
	@GetMapping(path= {"/"})
	public String home() {
		return "xyz";
	}
	
	
	@GetMapping(path= {"html"})
	public String home1() {
		return "demo";
	}
	
}
