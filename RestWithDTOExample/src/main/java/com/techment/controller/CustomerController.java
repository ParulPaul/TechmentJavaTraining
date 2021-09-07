package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exeception.IDNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value="/customerController")
public class CustomerController {

	@Autowired
	ICustomerService customerService;
	
	@GetMapping(value="/viewAllCustomers")
	public List<CustomerDto> viewAllCustomer()
	{
		return customerService.viewAllCustomers();
		
	}

	@PostMapping(value= "/insertCustomer")
	public String addNewCustomer(@RequestBody CustomerDto customer) {
		customerService.addCustomer(customer);
		return "inertion done";
		
	}
	
	@GetMapping(value="/customerById/id")
	public CustomerDto getbyId(@PathVariable int id)
	{
		CustomerDto customerDto =customerService.viewCustomerById(id);
		return customerDto;
		
	}

	@ExceptionHandler(value= IDNotFoundException.class)
	public ResponseEntity<Object> handlingException(IDNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMsg(),HttpStatus.NOT_FOUND);
		
	}

	@GetMapping(value="/viewCustomerById/{id}")
	public CustomerDto getCustomerById(@PathVariable int id) {
		
		try{
			return customerService.viewCustomerById(id);
		}
		catch(NoSuchElementException e) {
			
		}
		throw new IDNotFoundException("no id presen to get id");
		
	}

	@PutMapping("{id}")
	public  ResponseEntity<CustomerDto> updateEmployee(@PathVariable int id,@RequestBody CustomerDto customedto) {
		return new ResponseEntity<CustomerDto>(customerService.updateCustomer(customedto, id), HttpStatus.OK);
		
	} 
	
	@DeleteMapping("{id}")
	public  ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Employee is deleted", HttpStatus.OK);
		
	}
	
}