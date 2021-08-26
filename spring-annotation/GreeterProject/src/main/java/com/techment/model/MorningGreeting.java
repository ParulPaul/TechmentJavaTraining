package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements IGreeting{

	 String greeting="GoodMorning";

	public String greet() {
		
		return greeting;
	}

	

	
	
}
