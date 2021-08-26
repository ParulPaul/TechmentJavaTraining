package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.techment.service.GreetingService;

public class ClientApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
		GreetingService  service = (GreetingService) context.getBean("greetingService");
		System.out.println(service.displayService());

	}

}
