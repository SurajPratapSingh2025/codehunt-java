package com.mainapp.service;

import java.util.List;

import com.mainapp.dto.EmpDto;
import com.mainapp.dto.hybrid.EmpFullDto;
import com.mainapp.entity.EmpEntity;
import com.mainapp.payload.ApiResponse;

public interface EmpService {
	
	public ApiResponse<EmpEntity> saveEmp(EmpDto empDto);
	
	public ApiResponse<List<EmpEntity>> getAllEmp();
	
	public ApiResponse<EmpEntity> getSingleEmp(String id);
	
	public ApiResponse<EmpEntity> getFullEmp(EmpFullDto empFullDto);
	
	public ApiResponse<Object> deleteFullEmp(String id);

}
