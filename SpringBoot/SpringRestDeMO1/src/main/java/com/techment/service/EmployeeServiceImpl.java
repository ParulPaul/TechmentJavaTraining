package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.techment.dao.IEmployeeDao;
import com.techment.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao iEmployeeDao;
	
	@Override
	public String addEmployee(Employee employee) {
		iEmployeeDao.save(employee);
		return "employee added";
	}

	@Override
	public List<Employee> viewAllEmployees() {
		return iEmployeeDao.findAll();
	}

	
	@Override
	public Employee viewEmployeeById(int id) {
		
		return iEmployeeDao.getById(1);
	}

}
