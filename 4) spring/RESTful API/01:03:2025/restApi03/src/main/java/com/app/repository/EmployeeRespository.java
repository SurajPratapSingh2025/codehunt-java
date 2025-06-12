package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.EmployeeEntity;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity,Integer>{

}
