package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Cricketer;

public class RowMapperImpl implements RowMapper<Cricketer>{

	@Override
	public Cricketer mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Cricketer cr=new Cricketer();
		cr.setId(rs.getInt("id"));
		cr.setName(rs.getString("name"));
		cr.setAddress(rs.getString("address"));
		cr.setSalary(rs.getInt("salary"));
		
		return cr;
	}

}
