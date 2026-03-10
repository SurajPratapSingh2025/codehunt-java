package com.mainapp.exception;

public class DuplicateResourceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DuplicateResourceException() {
		super("Duplicate Resource Exception");
	}
	
	public DuplicateResourceException(String msg) {
		super(msg);
	}
}
