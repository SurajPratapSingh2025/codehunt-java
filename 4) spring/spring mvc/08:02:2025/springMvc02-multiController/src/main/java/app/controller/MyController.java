package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class MyController {
	
//	@GetMapping("save")
	@GetMapping(path= {"xyz"})
	public String home() {
		return "userxyz";
	}
	
}
