package com.collection;

import java.util.ArrayList;

public class UserDefinedType {

	public static void main(String[] args) {
		
		
		Employee emp1= new Employee(1,"sachin","hr");

		Employee emp2= new Employee(2,"ravii","hr");
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"saurabh","developer"));
		
		
	for(Employee emp : employees) {
		
		if(emp.getId()>2)
			emp.setDept("Mangaer");
		
		System.out.println(emp.getId() +""+ emp.getName() +""+ emp.getDept());
		//System.out.println(emp.id +" "+ emp.name+" "+emp.dept);
	}				
		
	};

}
