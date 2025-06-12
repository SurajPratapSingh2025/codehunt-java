package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.entity.Employee;

public interface MyCrudRepository extends CrudRepository<Employee,Integer>{
	/*
	 * data read from 4 ways: inbuilt method, custom Query method, custom HQL method &
	 * derived Query method
	 */
	
	@Override 
	Iterable<Employee> findAll();							//inbuilt method
	
	@Query(value="select * from employee where name like 'm%'",nativeQuery=true)
	public List<Employee> readMyData();						//custom Query method
	
	@Query(value="from Employee where name like 'm%'")
	public List<Employee> readMyDataHQL();					//custom HQL method
	
//	@Override
//	Optional<Employee> findById(Integer id);
	
	
	//select * from employee where name=:name
	List<Employee> findByName(String name);
	
	List<Employee> findByNameContaining(String name);		//derived Query method
	
	List<Employee> findByNameStartingWith(String prefix);
	
	List<Employee> findByIdGreaterThan(int a);
	
	
	@Override
	long count();
	
	@Override
	public <S extends Employee> S save(S entity);
	
	@Override
	public Optional<Employee> findById(Integer id);
	
	@Override
	public <S extends Employee> Iterable<S> saveAll(Iterable<S> entities);
	
	@Override
	public void deleteById(Integer id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
