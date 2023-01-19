package com.axis.exception;

public class BankAccountException extends RuntimeException{
	
	public BankAccountException() {
	
	}

	
	public BankAccountException(String message) {
		
		super(message);
		
	}
}
