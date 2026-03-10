package com.mainapp.dto.hybrid;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.mainapp.dto.EmpDto;
import com.mainapp.dto.external.AccDto;
import com.mainapp.dto.external.PlotDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpFullDto {
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
