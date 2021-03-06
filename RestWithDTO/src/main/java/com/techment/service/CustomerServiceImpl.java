package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exeception.IDNotFoundException;


@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	ICustomerDao Dao;

	@Override
	public String addCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setAge(customerDto.getAge());
		customer.setEmail(customerDto.getEmail());;
		
		Dao.save(customer);
		return "Custommer is added";
		
	
	}

	@Override
	public List<CustomerDto> viewAllCustomers() {
		
		List<Customer> customers =Dao.findAll();
		List<CustomerDto >customerDto = new ArrayList< CustomerDto>();
	   
		
		for(Customer c : customers) {
			
			customerDto.add(new CustomerDto(c.getId(),c.getName(),c.getAge(),c.getAddress()));
		}
		
		return customerDto;
	}
/**
	@Override
	public CustomerDto viewCustomerById(int id)  {
	    Customer customer = Dao.findById(id).get();
		CustomerDto customerDto = new CustomerDto(customer.getId(), customer.getName(), customer.getAge(), customer.getAddress(), customer.getEmail(),customer.getMobile());
		
		return customerDto;
	}

	**/

	@Override
	public CustomerDto viewCustomerById(int id)throws NoSuchElementException{
		
		Customer customer =  Dao.findById(id).get();
		CustomerDto customerDto= new CustomerDto(customer.getId(),customer.getName(),customer.getAge(),customer.getAddress(),customer.getEmail(),customer.getMobile());
		
		return customerDto;
		
		
	}


public CustomerDto updateCustomer(CustomerDto customerDto, int id) throws NoSuchElementException {
 
	 Customer existingCustomer= Dao.findById(id).get();
	 existingCustomer.setId(customerDto.getId());
	 existingCustomer.setName(customerDto.getName());
	 existingCustomer.setAddress(customerDto.getAddress());
	 existingCustomer.setEmail(customerDto.getEmail());
	 existingCustomer.setMobile(customerDto.getMobile());
	 
	 Dao.save(existingCustomer);
	 
	 
	return customerDto;
}

@Override
public String deleteCustomer(int id) throws NoSuchElementException {
	 Dao.deleteById(id);
	 return deleteCustomer(id);
	
}

	
}
