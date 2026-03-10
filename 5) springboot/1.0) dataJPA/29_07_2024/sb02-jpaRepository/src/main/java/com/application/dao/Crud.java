package com.application.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.application.pojo.Employee;

import jakarta.transaction.Transactional;

public interface Crud extends CrudRepository<Employee, Integer>{
	
	//SQL Query
	@Modifying
	@Transactional
	@Query(value="insert into bootemployee(id,name,address,salary) values(:id,:name,:address,:salary)" ,nativeQuery=true)
	
	public int insertSQL(@Param("id")int id,@Param("name")String name,@Param("address")String address,@Param("salary")int salary);
	
	
	@Query(value="select * from bootemployee", nativeQuery=true)
	public List<Employee> readAllSql();
	
	@Query(value="select * from bootemployee where salary<2000",nativeQuery=true)
	public List<Employee>readSpecificSql();
	
	@Query(value="select * from bootemployee where id=:id",nativeQuery=true)
	public List<Employee>readSingleSql(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update bootemployee set salary=:salary where id=:id",nativeQuery=true)
	public int updateSql(@Param("salary") int salary, @Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="delete from bootemployee where id=:id",nativeQuery=true)
	public int deleteSql(@Param("id") int id);
	
	
	//Pure Java
	@Override
	public long count();
	
	@Override
	public Iterable<Employee> findAll();
	
	@Override
	public Optional<Employee> findById(Integer id);
	
	@Override
	public void deleteById(Integer id);
	
	@Override
	public <S extends Employee>S save (S entity);
	
	//HQL Query: read,update,delete :from pojoName
	@Query(value="from Employee")
	public List<Employee> readAllHql();
	
	@Modifying
	@Transactional
	@Query(value="update Employee set salary=:salary where id=:id")
	public int updateHql(@Param("salary") int salary, @Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="delete from Employee where id=:id")
	public int deleteHql(@Param("id") int id);
	
	@Override
	public void deleteAll();
	
}

