package com.mainapp.dto.hybrid;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.mainapp.dto.PlotDto;
import com.mainapp.dto.external.AccDto;
import com.mainapp.dto.external.EmpDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlotFullDto {
	@Valid
	@NotNull
	private EmpDto empDto;
	@Valid
	@NotNull
	private AccDto accDto;
	@Valid
	@NotNull
	private PlotDto plotDto;

}
