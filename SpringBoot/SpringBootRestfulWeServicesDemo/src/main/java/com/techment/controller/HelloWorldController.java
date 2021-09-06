package com.techment.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController { //this class now able to handle web requests

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
}
