package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.model.IGreeting;

@Service
public class GreetingService {
    
	@Autowired
	 @Qualifier("morningGreeting")
	IGreeting greeting;

	public String displayService() {
		
		return greeting.greet();
	}
		

}