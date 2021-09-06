package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh", "gupta");
	}
	
	//listOfStudents
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shephali","Paul"));
		students.add(new Student("Parul","Paul"));
		students.add(new Student("Sonal","Nety"));
		students.add(new Student("Rashmi","Lal"));
		students.add(new Student("Aashi","Lal"));
		
		return students;
		
	}
	
	//@PathVariable
	//http://localhost:8090/students/parul/paul
	@GetMapping("/students/{firstName}/{lastName}")
	
	public Student studentPathVariable(@PathVariable("firstName")String firstName, 
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
		
	}
	
	// build rest API to handle query parameters
	// http://localhost:8090/student/query?firstName=Shephali&lastName=Paul
	
	@GetMapping("/students/query")
	public Student studentQueryParam(
		@RequestParam(name="firstName") String firstName,
		@RequestParam(name="lastName")	String lastName) {
		return new Student(firstName,lastName);}
	
	
	 
}
