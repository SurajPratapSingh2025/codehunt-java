package com.mainapp.external.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mainapp.dto.external.AccDto;
import com.mainapp.entity.external.AccResponse;
import com.mainapp.payload.ApiResponse;

@FeignClient(name="SPB11-ACCOUNTPROJ")
public interface AccClient {
	
//	@GetMapping("/{id}")
//	public abstract ApiResponse<AccResponse> getSingleAcc(@PathVariable String id);
	
	@PostMapping("/acc")
	public ResponseEntity<ApiResponse<AccResponse>> saveAcc(@Valid @RequestBody AccDto accDto);
	
	
	@DeleteMapping("/acc/{id}")
	public ResponseEntity<ApiResponse<Object>> deleteAcc(@PathVariable String id);

}
