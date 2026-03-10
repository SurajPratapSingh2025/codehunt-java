package com.mainapp.service;

import java.util.List;

import com.mainapp.dto.AccDto;
import com.mainapp.entity.AccEntity;
import com.mainapp.payload.ApiResponse;

public interface AccService {
	
	public ApiResponse<AccEntity> saveAcc(AccDto accDto);
	
	public ApiResponse<List<AccEntity>> getAllAcc();
	
	public ApiResponse<AccEntity> getSingleAcc(String id);
	
	public ApiResponse<Object> deleteAcc(String id);

}
