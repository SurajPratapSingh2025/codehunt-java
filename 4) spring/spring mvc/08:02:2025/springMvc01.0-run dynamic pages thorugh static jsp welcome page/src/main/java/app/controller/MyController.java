package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
//	@GetMapping("save")
	@GetMapping(path= {"save","demo","test"})
	public String home() {
		return "xyz";
	}
	
}
