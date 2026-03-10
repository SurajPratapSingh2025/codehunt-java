package com.mainapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.AccEntity;
@Repository
public interface AccRepository extends JpaRepository<AccEntity,String>{
	
	Optional<AccEntity> findByAccno(String accno);

	public void deleteByEmployeeId(String id);
}
