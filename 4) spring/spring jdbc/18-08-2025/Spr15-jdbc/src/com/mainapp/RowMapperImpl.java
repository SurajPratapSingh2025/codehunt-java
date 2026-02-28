package com.mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Dto>{

	@Override
	public Dto mapRow(ResultSet rs, int rowCount) throws SQLException {
		Dto dto=new Dto();
		dto.setRollno(rs.getInt("rollno"));
		dto.setFullname(rs.getString("fullname"));
		dto.setCourse(rs.getString("course"));
		dto.setFee(rs.getFloat("fee"));
		dto.setCollege(rs.getString("college"));
		dto.setAddress(rs.getString("address"));
		System.out.println("Row Mapped "+(rowCount+1));
		return dto;
	}
	
}
