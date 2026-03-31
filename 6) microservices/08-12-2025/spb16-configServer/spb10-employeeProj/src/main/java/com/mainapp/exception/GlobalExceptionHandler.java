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
	
}
