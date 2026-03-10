package com.mainapp.exception.external;

import org.springframework.http.HttpStatus;

import feign.FeignException;

public class EmpServiceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private final HttpStatus httpStatus;

	public EmpServiceException(String message, HttpStatus httpStatus, FeignException e) {
		super(message,e);
		this.httpStatus=httpStatus;
	}


	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

}