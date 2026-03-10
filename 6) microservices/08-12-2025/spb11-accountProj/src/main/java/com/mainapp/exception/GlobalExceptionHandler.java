package com.mainapp.exception;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mainapp.exception.external.EmpServiceException;
import com.mainapp.payload.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<?>> handleGenericException(Exception exception) {
		ApiResponse<?> apiResponse = new ApiResponse<>("Error",exception.getMessage(),Collections.emptyMap());
		return new ResponseEntity<>(apiResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ApiResponse<?>> handleValidationException(MethodArgumentNotValidException exception) {
		Map<String,String> error = new HashMap<>();
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		for(FieldError fe:fieldErrors) {
			error.put(fe.getField(), fe.getDefaultMessage());
		}
		ApiResponse<?> apiResponse = new ApiResponse<>("Error",exception.getMessage(),error);
		return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse<?>> handleValidationException(ResourceNotFoundException exception) {
		ApiResponse<Map<Object, Object>> apiResponse = new ApiResponse<>("Error",exception.getMessage(),Collections.emptyMap());
		return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DuplicateResourceException.class)
	public ResponseEntity<ApiResponse<?>> duplicateResourceException(DuplicateResourceException exception) {
		ApiResponse<Map<Object, Object>> apiResponse = new ApiResponse<>("Error",exception.getMessage(),Collections.emptyMap());
		return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
	}
	

//	@ExceptionHandler(FeignException.class)
//	public ResponseEntity<ApiResponse<?>> duplicateResourceException(FeignException exception) {
//		
//		String url = exception.request().url();
//		String empId = url.substring(url.lastIndexOf("/")+1);
//		HttpStatus httpStatus = HttpStatus.resolve(exception.status());
//		if(httpStatus==null) {
//			httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
//		}
//		String message;
//		if(httpStatus==HttpStatus.BAD_REQUEST) {
//			message="Emp not found with id: "+empId;
//		}else {
//			message="Error while communicating with Emp Service";
//		}
//		
//		
//		
//		ApiResponse<Map<Object, Object>> apiResponse = new ApiResponse<>("Error",message,Collections.emptyMap());
//		return new ResponseEntity<>(apiResponse,httpStatus);
//	}
	
	
	@ExceptionHandler(EmpServiceException.class)
	public ResponseEntity<ApiResponse<Map<Object,Object>>> handleEmpServiceException(EmpServiceException exception){
		ApiResponse<Map<Object, Object>> apiResponse = new ApiResponse<>("Error",exception.getMessage(),Collections.emptyMap());
		return new ResponseEntity<>(apiResponse,exception.getHttpStatus());
	}
	
	
	
}
