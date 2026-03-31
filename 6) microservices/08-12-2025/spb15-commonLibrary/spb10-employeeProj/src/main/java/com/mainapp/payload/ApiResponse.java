package com.mainapp.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {	//in place of ApiResponse we also may be create map
	
	private String status;
	private String messaage;
	private T data;				//its type is generic So, it holds anything

}
