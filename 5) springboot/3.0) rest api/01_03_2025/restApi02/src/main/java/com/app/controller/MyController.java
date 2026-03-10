package com.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.service.MyService;
import com.app.dto.EmployeeDTO;

@RestController
@RequestMapping("/api/")
public class MyController {
    
    @Autowired
    private MyService myService;
    
//    @ResponseBody
//    @GetMapping("readtest")
//    public String testRead() {
//    	return myService.read();
//    }
    
    @PostMapping("insert")
    public ResponseEntity<String> insert(@RequestBody EmployeeDTO employeeDTO) {
    	String result=myService.insert(employeeDTO);
    	if(result.equals("SUCCESS")) {
    		ResponseEntity<String> responseEntity = new ResponseEntity<>(result,HttpStatus.CREATED);
    		return responseEntity;
    	}
    	else {
    		return new ResponseEntity<>(result,HttpStatus.CONFLICT);
    	}
    }
    
    
    @PostMapping("read")
    public ResponseEntity<List<EmployeeDTO>> read() {
    	
//    	return new ResponseEntity<>(myService.read(),HttpStatus.OK);
    	return ResponseEntity.ok(myService.read());
    }
    
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
    	System.out.println(id);
    	return ResponseEntity.ok("DELETED");
    }
    
    @PutMapping("update/{id}")
    public ResponseEntity<String> fullUdpate(@PathVariable int id, @RequestBody EmployeeDTO dto) {
    	
    	String result=myService.fullUpdate(id, dto);
    	if(result.equals("NOT_FOUND")) {
    		return new ResponseEntity<>(result,HttpStatus.NOT_FOUND);
    	}
    	else {
    		return new ResponseEntity<>(result,HttpStatus.OK);

    	}
    }
    
    
    @PatchMapping("partialupdate")
    public ResponseEntity<String> partialUdpate(@RequestParam int id, @RequestParam int salary) {
    	
//    	System.out.println(id+"->"+salary);
//    	String result="UPDATED";
//    	return new ResponseEntity<>(result,HttpStatus.OK);
    	
    	String result=myService.partialUpdate(id,salary);
    	if(result.equals("NOT_FOUND")) {
    		return new ResponseEntity<>(result,HttpStatus.NOT_FOUND);
    	}
    	else {
    		return new ResponseEntity<>(result,HttpStatus.OK);
    	}
    }
    
    
    
    @PatchMapping("partialupdatetwo/{id}")
    public ResponseEntity<String> partialUdpate(@PathVariable int id, @RequestBody Map<String,Object> partialUpdateData) {
    	System.out.println(partialUpdateData);
    	return new ResponseEntity("UPDATED",HttpStatus.OK);
    }
    
    
    
    
    
    
    
    
    
    
    

}

//http://localhost:8080/api/readtest


