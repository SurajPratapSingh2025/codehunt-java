package com.application.dao;

import java.util.Optional;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.application.pojo.Employee;

public interface Jpa extends JpaRepository<Employee,Integer>, JpaSpecificationExecutor<Employee>{
	
	//Specification
	@Override
	public long count(Specification<Employee> spec);
	
	@Override
	public Optional<Employee> findOne(Specification<Employee> spec);
	
	@Override
	public boolean exists(Specification<Employee> spec);
	
	
	
	
	
	
}
