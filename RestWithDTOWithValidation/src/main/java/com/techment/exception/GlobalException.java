package com.techment.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.techment.entity.Customer;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = IDNotFoundException.class)
	public ResponseEntity<Object> MyException(IDNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMsg(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = CustomerException.class)
	public ResponseEntity<String> myCustomerException(CustomerException exception )
	{
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = ValidationException.class)
	public ResponseEntity<List<String>> myValidation(ValidationException exception)
	{
		return new ResponseEntity<List<String>>(exception.getMessages(),HttpStatus.BAD_REQUEST);
	}
}
