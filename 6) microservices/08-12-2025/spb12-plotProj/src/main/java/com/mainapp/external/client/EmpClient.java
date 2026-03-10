package com.mainapp.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mainapp.entity.external.EmpResponse;
import com.mainapp.payload.ApiResponse;

//@FeignClient(
//		name="emp",
//		url="http://localhost:8081/emp"
//		)
@FeignClient(name="SPB10-EMPLOYEEPROJ")
public interface EmpClient {
	
	@GetMapping("/emp/{id}")
	public ApiResponse<EmpResponse> getSingleEmp(@PathVariable String id);

}
