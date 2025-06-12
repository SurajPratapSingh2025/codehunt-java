package com.springJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		Employee emp = new Employee();
		emp.setEid(rs.getInt("eid"));
		emp.setEname(rs.getString("ename"));
		
		
		return emp;
	}
	
}
