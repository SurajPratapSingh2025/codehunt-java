package com.mainapp.exception;

//public class ResourceNotFoundException extends ResourceNotFoundExcep{		//ResourceNotFoundExcep come from commonLibrary dependency
//	
////	private static final long serialVersionUID = 1L;
////	
////	public ResourceNotFoundExcep() {
////		super("Resource Not Found Exception");
////	}
////	
////	public ResourceNotFoundExcep(String id) {
////		super(id);
////	}
//
//}
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException() {
		super("Resource Not Found Exception");
	}
	
	public ResourceNotFoundException(String id) {
		super(id);
	}

}