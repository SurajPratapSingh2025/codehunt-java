package com.mainapp.external.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mainapp.dto.external.PlotDto;
import com.mainapp.entity.external.PlotResponse;
import com.mainapp.payload.ApiResponse;

@FeignClient(name="SPB12-PLOTPROJ")
public interface PlotClient {
	
//	@GetMapping("/{id}")
//	public abstract ApiResponse<PlotResponse> getSingleEmp(@PathVariable String id);
	
	@PostMapping("/plot")
	public ResponseEntity<ApiResponse<PlotResponse>> savePlot(@Valid @RequestBody PlotDto plotDto);
	
	
	@DeleteMapping("/plot/{id}")
	public ResponseEntity<ApiResponse<Object>> deletePlot(@PathVariable String id);
	

}
