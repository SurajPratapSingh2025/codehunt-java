package com.mainapp.service;

import java.util.List;

import com.mainapp.dto.PlotDto;
import com.mainapp.entity.PlotEntity;
import com.mainapp.payload.ApiResponse;

public interface PlotService {
	
	public ApiResponse<PlotEntity> savePlot(PlotDto empDto);
	
	public ApiResponse<List<PlotEntity>> getAllPlot();
	
	public ApiResponse<PlotEntity> getSinglePlot(String id);

	public ApiResponse<Object> deletePlot(String id);

}
