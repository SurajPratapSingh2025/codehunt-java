package com.springJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("crud")
public class Crud {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



//	public void insertMyData(int eid, String ename) {
//		String sql="insert into test(eid,ename) values(?,?)";
//		int row = jdbcTemplate.update(sql,eid,ename);
//		System.out.println(row+" rows are inserted");
//	}
//	
//	public void deleteMyData(int eid) {
//		String sql="DELETE FROM test WHERE eid = ?";
//		int row = jdbcTemplate.update(sql,eid);
//		System.out.println(row+" rows are deleted");
//	}
//	
//	public void updateMyData(int eid, String ename) {
//		String sql="UPDATE test SET ename = ? WHERE eid = ?";
//		int row = jdbcTemplate.update(sql,ename,eid);
//		System.out.println(row+" rows are updated");
//	}
//	
//	public void readMyData1() {
//		String sql="select * from test";
//		List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
//		for(Map<String,Object> map:list) {
//			for(Entry<String,Object> entry:map.entrySet()) {
//				System.out.print(entry.getKey()+":- "+entry.getValue()+"\t");
//			}
//		}
//	}
//	
	//Bulk Data Read
//	public void readMyData2() {
//		String sql="select * from test";
//		List<Employee> list=jdbcTemplate.query(sql, new RowMapperImpl());
//		
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//
//	}
	
	//single Data
	public void readMyData3(int eid) {
		String sql="select * from test where eid=?";
		Employee emp=jdbcTemplate.queryForObject(sql, new RowMapperImpl(),eid);
		System.out.println(emp);
		
	}

}


