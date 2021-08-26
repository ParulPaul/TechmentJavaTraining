package com.techment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.model.Employee;
import com.techment.model.IDao;


@Service("dbService")
public class DatabaseService {

	
		

		@Autowired
		@Qualifier("oracle")
		IDao dao;
	   
		@Autowired
		Employee employee;
		
		

	public void displayDatabaseInfo() {
	
		dao.databaseName();
		employee.displayEmployeeInfo();
	}

	

}
