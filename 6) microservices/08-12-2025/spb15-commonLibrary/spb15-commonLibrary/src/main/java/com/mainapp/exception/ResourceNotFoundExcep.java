package com.mainapp.exception;

public class ResourceNotFoundExcep extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcep() {
		super("Resource Not Found Exception");
	}
	
	public ResourceNotFoundExcep(String id) {
		super(id);
	}

}
