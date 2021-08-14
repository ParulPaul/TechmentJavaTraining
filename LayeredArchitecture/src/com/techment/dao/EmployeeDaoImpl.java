package com.techment.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techment.model.Employee;
import com.techment.util.CollectionUtil;

public class EmployeeDaoImpl implements IEmployeeDao {
	
	//to access the data ...Interface Implementation
	
	CollectionUtil collectionUtil = new CollectionUtil();
	

	@Override
	public Employee getEmployeeById(int id) {
		
		Map<Integer,Employee> empMap = collectionUtil.getEmployeeList();
		Employee employee = empMap.get(id);
		
		//from map get the id
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		
		//List Is declared to share all the employee based on dept
		List<Employee> employeeList = new ArrayList<Employee>(); //employeelist is empty here
		
		
		//it returns the map data which contains employee details
		Map<Integer,Employee> empMap = collectionUtil.getEmployeeList();
		
		for(Employee employee: empMap.values()) {
			
			if(employee.getDept().equalsIgnoreCase(dept)) //checks and compare and returns the values
			{
			  
				employeeList.add(employee);
			}
		}
		
		return employeeList;
		
	}

}
