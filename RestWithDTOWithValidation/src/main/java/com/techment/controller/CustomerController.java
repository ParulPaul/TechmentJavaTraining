package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
import com.techment.exception.IDNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value = "/customerController")
public class CustomerController {
	
	@Autowired
	ICustomerService service;

	@GetMapping(value = "/viewAllCustomers")
	public List<CustomerDto> viewCustomer()
	{
		return service.viewAllCustomers();
	}
	
	
	//For Inserting A new Course
	@PostMapping(value = "/InsertCustomer")
	public String addNewCustomer(@Valid @RequestBody CustomerDto customerDto,BindingResult bindingResult) throws MethodArgumentNotValidException {
		
		if(bindingResult.hasErrors()==true)
		{
			System.out.println("Some Error is there");
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();
			
			for(FieldError f:errors)
			{
				errorList.add(f.getDefaultMessage());
			}
			
			
			//throw new ValidationException(errorList);
			throw new com.techment.exception.ValidationException(errorList);
		}
		
		
		
		
		
		service.addCustomer(customerDto);

		return "Insertion Done";
	}
	
	@GetMapping(value = "/customerById/{id}")
	public CustomerDto getById(@PathVariable int id)
	{
		try {
			CustomerDto customer = service.viewCustomerById(id);
			return customer;
		} catch (NoSuchElementException e) {
			throw new IDNotFoundException("No Such Id Details Present");
		}
		
		
		
	}
	
	
	
	@DeleteMapping("/DeleteCustomerById/{id}")
	public String deleteId(@PathVariable int id)
	{
		try {
			service.deleteCustomerById(id);
			return "Course Deleted";

		} catch (Exception e) {
		
			throw new IDNotFoundException("No Such Id Details Present");
		}
		
	}
	
	
	@PutMapping("/CustomerUpdateById/{id}")
	public String updateCourse(@PathVariable int id,@RequestBody Customer customer)
	{
		try
		{
			CustomerDto customerDto = service.viewCustomerById(id);
			customerDto.setName(customer.getName());
			customerDto.setAddress(customer.getAddress());//(customer.getName());
			customerDto.setAge(customer.getAge());
			customerDto.setEmail(customer.getEmail());
			customerDto.setMobile(customer.getMobile());
			service.addCustomer(customerDto);
			
//			c.setName(course.getName());
//			c.setPrice(course.getPrice());			
//			dao.saveCourse(c);
			return "Course Updated";
		}
		catch(Exception e)
		{
			return e.toString();
		}
	}


	
	
	
	
	
	
//	@ExceptionHandler(value = IDNotFoundException.class)
//	public ResponseEntity<Object> MyException(IDNotFoundException exception)
//	{
//		return new ResponseEntity<Object>(exception.getMsg(),HttpStatus.NOT_FOUND);
//	}
	
}
