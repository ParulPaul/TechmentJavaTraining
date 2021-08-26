package com.techment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	Address address;
	
		
	public void displayDetails() {
		address.AddressDetails();
	}
	

}
