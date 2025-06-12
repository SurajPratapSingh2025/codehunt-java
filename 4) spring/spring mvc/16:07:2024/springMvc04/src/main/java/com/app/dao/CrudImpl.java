package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.Cricketer;

@Repository
public class CrudImpl implements Crud{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public String saveData(Cricketer c) {
		
		String sql="insert into cricketer(id,name,address,salary) values(?,?,?,?,?)";
		int update = jdbcTemplate.update(sql,c.getId(),c.getName(),c.getAddress(),c.getSalary());
		if(update==1) {
			return "DATA SAVED SUCCESSFULLY";
		}
		
		return "FAILED to save";
	}

	@Override
	public List<Cricketer> readData() {
		
		String sql="select * from cricketer";
		List<Cricketer> list = jdbcTemplate.query(sql, new RowMapperImpl());
		
		return list;
	}

}
