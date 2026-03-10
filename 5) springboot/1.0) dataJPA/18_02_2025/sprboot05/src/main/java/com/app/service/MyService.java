package com.app.service;

import java.io.FileOutputStream;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.Employee;
import com.app.entity.EmployeeDTO;
import com.app.repository.Crud;

@Service
public class MyService {
	
	@Autowired
	private Crud crud;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private String result;
	
	
	
	
	
	
	
	
	@Transactional(rollbackOn=Exception.class)
	public String insertData(EmployeeDTO emp, MultipartFile multipartFile) throws Exception {
		
		String originalFilename = multipartFile.getOriginalFilename();
//		System.out.println(originalFilename);
		emp.setMyfile(originalFilename);
		
		Employee entity = modelMapper.map(emp, Employee.class);
		entity.setUcode(emp.getId()+1000);
		crud.save(entity);
		
		//folder file upload
		try {
			
			//checked exception
			byte[] bytes=multipartFile.getBytes();
			String path="D:\\sts-workspace\\sprboot05\\src\\main\\webapp\\myfiles\\"+originalFilename;
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(bytes);
			
			//unchecked exception
//			String s=null;
//			System.out.println(s.length());
			
			result="SUCCESS";
		} catch (Exception e) {
			result="FAILED";
			e.printStackTrace();
			throw e;
		}
		
		return result;
	}

	public List<Employee> read() {
		
		return crud.findAll();
	}

	
	public String delete(int id) {
		
		crud.deleteById(id);
		return "DELETED";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
