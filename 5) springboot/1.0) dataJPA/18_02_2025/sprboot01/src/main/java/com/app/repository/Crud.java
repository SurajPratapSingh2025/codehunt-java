package com.app.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;

@Repository
public class Crud {
	
	@Autowired
	private EntityManager entityManager;	//hibernate impl
	
	@Transactional
	public void raju(Employee emp) {
		entityManager.persist(emp);		//hibernate impl
	}
}
