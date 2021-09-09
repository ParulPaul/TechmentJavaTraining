package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;


public interface ICustomerService {

	//controller is going to call service
	String addCustomer(CustomerDto customerDto);
	
	List<CustomerDto> viewAllCustomers();
	
	 CustomerDto viewCustomerById(int id);
	 
	 CustomerDto updateCustomer(CustomerDto customerDto, int id);
	 
	
	String deleteCustomer(int id);

	
}
