package com.mainapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.dto.PlotDto;
import com.mainapp.entity.PlotEntity;
import com.mainapp.payload.ApiResponse;
import com.mainapp.service.PlotServiceImpl;

@RestController
@RequestMapping("/plot")
public class PlotController {
	
	@Autowired
	private PlotServiceImpl plotServiceImpl;
	
	
	//save all plot
	@PostMapping
	public ResponseEntity<ApiResponse<PlotEntity>> savePlot(@Valid @RequestBody PlotDto plotDto){		//MethodArgumentNotValidException
		ApiResponse<PlotEntity> savePlot = plotServiceImpl.savePlot(plotDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(savePlot);
	}
	//get all plot
	@GetMapping
	public ResponseEntity<ApiResponse<List<PlotEntity>>> findAll() {
		ApiResponse<List<PlotEntity>> allPlot = plotServiceImpl.getAllPlot();
		return ResponseEntity.ok(allPlot);
	}
	
	//get single plot
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<PlotEntity>> findById(@PathVariable String id){
		ApiResponse<PlotEntity> singlePlot = plotServiceImpl.getSinglePlot(id);
		return ResponseEntity.ok(singlePlot);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse<Object>> deletePlot(@PathVariable String id){
		
		ApiResponse<Object> plotDeleteResponse = plotServiceImpl.deletePlot(id);
		return ResponseEntity.ok(plotDeleteResponse);
	}
	
	
	
	
	
	
}
