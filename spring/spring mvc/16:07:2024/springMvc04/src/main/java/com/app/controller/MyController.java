package com.app.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.model.Cricketer;
import com.app.service.MyService;

@Controller
public class MyController {
	
	private MyService myService;
	
	@GetMapping(path= {"/","index"})
	public String welcomeView() {
		return "index";
	}
	
	
	@GetMapping(path= {"delete"})
	public String deleteView() {
		return "delete";
	}
	
	
	@GetMapping(path= {"insert"})
	public String insertView() {
		return "insert";
	}
	
	@PostMapping(path= {"insert"})
//	public String insertData(@ModelAttribute Cricketer cricketer,HttpServletRequest request) {
	public String insertData(@ModelAttribute Cricketer cricketer,Model model,RedirectAttributes redirectAttributes) {
		
		String result = myService.saveData(cricketer);
		System.out.println(result);
		
		//insert code
//		request.getSession().setAttribute("msg", result);
//		model.addAttribute("msg",result);
		redirectAttributes.addFlashAttribute("msg",result);
		return "redirect:/insert";
	}

		//POST	REDIRECT(Browser Intrnally)	insert(GET)
	
	
	@PostMapping(path= {"delete"})
	public String deleteData(@RequestParam("id") int id) {
		System.out.println(id);
		//delete code
		
		return "delete";
	}
	
	
	@GetMapping(path="readalldata")
	public String readAllData(Model model) {
		
		//read
		List<Cricketer> list=myService.readAllData();
		model.addAttribute("data",list);
		
		return "read";
	}
	
	
	@GetMapping(path="deletefromread")
	public String deleteFromRead(@RequestParam("id") int id) {
		
		System.out.println(id);
		//Logic
//		redirectAttributes.addFlashAttribute("msg","data deleted successfully");
		
		return "redirect:/readalldata";
	}
	
	
	
	
	@GetMapping("fileupload")
	public String fileUploadView() {
		
		
		return "fileupload";
	}
	
	
	
	@PostMapping("fileupload")
	public String fileUpload(@RequestParam("myfile") CommonsMultipartFile commonsMultipartFile,HttpServletRequest httpServletRequest) throws IOException {
		
		String originalFilename=commonsMultipartFile.getOriginalFilename();
		System.out.println(originalFilename);
		String contentType = commonsMultipartFile.getContentType();
		System.out.println(contentType);
		long size = commonsMultipartFile.getSize();
		System.out.println(size);
		
		byte[] bytes = commonsMultipartFile.getBytes();
//		String path="C:\\Users\\suraj\\Documents\\workspace-spring-tools-for-eclipse-4.30.0.RELEASE\\springMvc04\\src\\main\\webapp\\images\\"+originalFilename;
		String realPath = httpServletRequest.getServletContext().getRealPath("images")+File.separator+originalFilename;
		FileOutputStream fos=new FileOutputStream(realPath);
		fos.write(bytes);
		fos.close();
		System.out.println("FILE UPLOADED");
		
		return "redirect:/fileupload";
	}
	
	
}
