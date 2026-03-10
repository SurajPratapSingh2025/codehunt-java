package com.mainapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.PlotEntity;
@Repository
public interface PlotRepository extends JpaRepository<PlotEntity,String>{

	void deleteByEmployeeId(String id);

}
