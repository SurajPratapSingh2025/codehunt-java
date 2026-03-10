package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.Employee;

public interface CrudDataJPA extends CrudRepository<Employee,Integer>{

}
