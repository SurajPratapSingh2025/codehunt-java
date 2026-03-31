package com.mainapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.EmpEntity;
@Repository
public interface EmpRepository extends JpaRepository<EmpEntity,String>{

}
