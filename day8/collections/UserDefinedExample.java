package com.day8.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
   int id;
   String name;
   String dept;
   int age;

   
   public Employee(int id, String name, String dept, int age) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.age = age;
	
}

   

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
}



@Override
public int compareTo(Employee o) {
	
	if(this.age==o.age)
		return 0;
	else if(this.age>o.age)
	     return 1;
	else return -1;

}
   	
}

public class UserDefinedExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"ramesh","hr",30));
		employees.add(new Employee(2,"sachin","manager",45));
		employees.add(new Employee(3,"mainsh","hr",26));
		employees.add(new Employee(1,"aadi","developer",30));

		for(Employee emp :employees) {
			
			System.out.println(emp.id +" "+ emp.name +" "+ emp.dept +" "+ emp.age);
		}
		
		
		Collections.sort(employees);
		
		
		System.out.println("after sorting");
		

		for(Employee emp :employees) {
			
			System.out.println(emp.id +" "+ emp.name +" "+ emp.dept +" "+ emp.age);
		}
		
		
		//System.out.println(employees);
		
		
	}

}
