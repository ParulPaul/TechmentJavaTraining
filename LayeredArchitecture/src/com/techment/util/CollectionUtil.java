package com.techment.util;

import java.util.HashMap;
import java.util.Map;

import com.techment.model.Employee;

public class CollectionUtil {

	static Map<Integer,Employee> employees = new HashMap<Integer, Employee>();
	
	static {
		
		employees.put(1, new Employee(1,"john","hr",34000));
		employees.put(2, new Employee(1,"sachin","developer",134000));
		employees.put(3, new Employee(1,"manish","manager",33000));
		employees.put(4, new Employee(1,"parul","hr",30000));
		
	}
	
	/*
	 * This method is used to get the employee map,
	 * which we intailise as static data
	 * 
	 * returns employee list
	 * ***/
	public static Map<Integer, Employee> getEmployeeList()
	{
		return employees;
	}
}
