package com.app.repository;

import java.awt.print.Pageable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.Employee;

public interface MyJpaRepository extends JpaRepository<Employee,Integer>{

	
	@Override
	List<Employee> findAll(Sort sort);
	
	Page<Employee> findAll(Pageable pageable);
	
	List<Employee> getContent(); 
	
	//custom method
	@Transactional
	@Modifying
	@Query(value="insert into employee(id,name) values(:id,:name)",nativeQuery=true)
	public int insert(@Param("id") int id,@Param("name") String name);
	
	@Transactional
	@Modifying
	@Query(value="delete from employee where id=:id",nativeQuery=true)
	public int delete(@Param("id") int id);
	
	@Transactional
	@Modifying
	@Query(value="update employee set name=:name where id=:id",nativeQuery=true)
	public int update(@Param("id") int id, @Param("name") String name);

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
