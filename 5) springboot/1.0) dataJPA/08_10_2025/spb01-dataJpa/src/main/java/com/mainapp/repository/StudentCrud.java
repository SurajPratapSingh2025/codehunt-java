package com.mainapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.StudentEntity;
@Repository
public interface StudentCrud extends JpaRepository<StudentEntity,Integer>{
	
	@Modifying
	@Transactional
	@Query(value="insert into student(rollno,fullname,course,fee,college,address) values(:rollno,:fullname,:course,:fee,:college,:address)",nativeQuery=true)
	public int saveMyData(int rollno,String fullname,String course,float fee,String college,String address);
	
	@Query(value="select * from student where fee>18000.57",nativeQuery=true)
	public List<StudentEntity> readMyData();
	
	@Query(value="from StudentEntity")
	public List<StudentEntity> readMyAllData();
	
	
	//custom conventionally method
	public List<StudentEntity> findByFee(float fee);			//select * from student where fee=:fee
	public List<StudentEntity> findByFeeLessThan(float fee);	//select * from student where fee>:fee
	
}
