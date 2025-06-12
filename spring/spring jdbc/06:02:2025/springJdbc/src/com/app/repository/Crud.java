package com.app.repository;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.jdbc.core.JdbcTemplate;

import com.app.pojo.Student;
import com.app.rowmapper.RowMapperImpl;

public class Crud {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public void insert(int id,String name) {
//		String sql="insert into student(id,name) values(?,?)";
//		int row = jdbcTemplate.update(sql,id,name);
//		System.out.println(row);
		System.out.println(jdbcTemplate.update("insert into student(id,name) values(?,?)",id,name));
		
	}
	public void delete(int id) {
		String sql="delete from student where id=? ";
		int row=jdbcTemplate.update(sql,id);
		System.out.println(row);
	}
	public void update(int id,String name) {
		String sql="update student set name=? where id=? ";
		int row=jdbcTemplate.update(sql,name,id);
		System.out.println(row);
	}
	public void readAllDefault() {
		String sql="select * from student";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
//		List[
//		     	Map: <ColumnName,Data> : put-><id,11> put-><name,xyz>
//		     	Map: <ColumnName,Data> : put-><id,13> put-><name,maju>
//		     ]
		
		//from collection
//		for(Map<String,Object> map:list) {
//			for(Entry<String,Object> entry:map.entrySet()) {
//				System.out.println(entry.getKey()+"->"+entry.getValue());
//			}
//		}
		
		//from stream
		list.forEach(map->map.forEach((key,value)->System.out.println(key+"->"+value)));
	}
	
	//for get direct list not map
	public void readAllPojo() {
		String sql="select * from student";
		List<Student> list = jdbcTemplate.query(sql, new RowMapperImpl());
		System.out.println(list);
		
	}
	
	public void readSingle(int id) {
		String sql="select * from student where id=? ";
		Student std = jdbcTemplate.queryForObject(sql,new RowMapperImpl(),id);
		System.out.println(std);
	}
}
