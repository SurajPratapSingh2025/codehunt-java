package com.mainapp;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.jdbc.core.JdbcTemplate;

public class Crud{
	
	private JdbcTemplate jdbcTemplate;	//inbuild driverManager
	
	public Crud() {
		System.out.println("Crud bean created");
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		createTable();		// ✅ runs AFTER dependency injection
	}

	
	public void insert(int rollno,String fullname,String course,float fee,String college,String address) {
		String sql="INSERT INTO student(rollno,fullname,course,fee,college,address) VALUES(?,?,?,?,?,?);";
		int row=jdbcTemplate.update(sql,rollno,fullname,course,fee,college,address);
		if(row>0) {
			System.out.println("data inserted");
		}else {
			System.out.println("data not inserted");
		}
	}
	
	public void readAll() {
		String sql="SELECT * FROM student;";
		List<Map<String,Object>> queryForList = jdbcTemplate.queryForList(sql);
		for(Map<String,Object> map:queryForList) {
			for(Entry<String,Object> e:map.entrySet()) {
				System.out.print(e.getKey()+"\t");
				System.out.println(e.getValue());
			}
			System.out.println();
		}
	}
	
	public void readAllPojoBased() {
		String sql="SELECT * FROM student;";
		List<Dto> list = jdbcTemplate.query(sql,new RowMapperImpl());
		for(Dto dto:list) {
			System.out.println(dto);
		}
	}
	
	public void readSingleData(int rollno) {
		String sql="SELECT * FROM student WHERE rollno=?;";
		Dto dto = jdbcTemplate.queryForObject(sql,new RowMapperImpl(),rollno);
		System.out.println(dto);
	}
	
	public void update(int rollno,String fullname,String course,float fee,String college,String address) {
		String sql="UPDATE student SET fullname=?,course=?,fee=?,college=?,address=? WHERE rollno=?;";
		int row=jdbcTemplate.update(sql,fullname,course,fee,college,address,rollno);
		if(row>0) {
			System.out.println("data updated");
		}else {
			System.out.println("data not updated");
		}
	}

	
	public void delete(int rollno) {
		String sql="DELETE FROM student WHERE rollno=?;";
		int row=jdbcTemplate.update(sql,rollno);
		if(row>0) {
			System.out.println("data deleted");
		}else {
			System.out.println("data not deleted");
		}
	}
	
	private void createTable(){
		try {
			String sql="CREATE TABLE IF NOT EXISTS student(rollno INT NOT NULL UNIQUE,"
					+ "fullname VARCHAR(20) NOT NULL ,"
					+ "course VARCHAR(50) NOT NULL ,"
					+ "fee DECIMAL(10,2) NOT NULL ,"
					+ "college VARCHAR(50) NOT NULL ,"
					+ "address VARCHAR(100) NOT NULL);";
			int row = jdbcTemplate.update(sql);
			if(row==0) {
				System.out.println("Table Created "+row);
			}else {
				System.out.println("Table Not Created "+row);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
