package com.tutorialspoint.myfirstwebapp.exception;

public class ProductNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public String getMessage(){
		return "Product not found !";
	}
}
