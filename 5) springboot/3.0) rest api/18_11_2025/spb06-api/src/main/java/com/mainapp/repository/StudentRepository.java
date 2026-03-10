package com.mainapp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
	@Modifying
	@Transactional
	@Query(value = "UPDATE student SET " +
	        "rollno = :rollno, " +
	        "fullname = :fullname, " +
	        "course = :course, " +
	        "fee = :fee, " +
	        "college = :college, " +
	        "address = :address, " +
	        "datetime = :datetime " +
	        "WHERE id = :id",
	        nativeQuery = true)
	int updateStudent(
	        @Param("id") int id,
	        @Param("rollno") int rollno,
	        @Param("fullname") String fullname,
	        @Param("course") String course,
	        @Param("fee") float fee,
	        @Param("college") String college,
	        @Param("address") String address,
	        @Param("datetime") String datetime
	);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE student SET " +
	        "fee = :fee, " +
	        "datetime = :datetime " +
	        "WHERE id = :id",
	        nativeQuery = true)
	int updateFee(
	        @Param("id") int id,
	        @Param("fee") float fee,
	        @Param("datetime") String datetime
	);
	
	
	
	
	
	
	
	
	
	
}
