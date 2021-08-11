package com.customexception;

public class InSufficientFundException extends RuntimeException{

	public InSufficientFundException(String message) {
		
		super(message);
	}

}
