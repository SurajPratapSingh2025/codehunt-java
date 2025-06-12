package com.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.pojo.Employee;


@Repository
public interface Crud extends JpaRepository<Employee,Integer>{
	
	
	

}
