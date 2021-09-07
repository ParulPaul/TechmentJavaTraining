package com.techment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.techment.exeception.ResourceNotFoundException;
import com.techment.model.Employee;
import com.techment.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService  {

	private IEmployeeRepository empRepo;
	
	
	public EmployeeServiceImpl(IEmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return empRepo.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		/** 
		 * Optional<Employee> employee = empRepo.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new ResourceNotFoundException("Employee","Id", id);
		}
		
		**/
		
		
		//lambda expression
		return empRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id",id));
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// 1st need to check whether employee id is present or not
		 Employee existingEmployee = empRepo.findById(id).orElseThrow(()  -> new ResourceNotFoundException("Employee", "Id",id));
	
	     existingEmployee.setFirstName(employee.getFirstName());
	     existingEmployee.setLastName(employee.getLastName());
	     existingEmployee.setEmail(employee.getEmail());
	     
	     empRepo.save(existingEmployee);
		
		return existingEmployee;
	}


	@Override
	public void deleteEmployee(long id) {
		empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
	empRepo.deleteById(id);
	
	}

	
	
}
