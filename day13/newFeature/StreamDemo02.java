package com.techment.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.techment.day12.newfeature.Employee;

class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		 if(o1.getAge()==o2.getAge())
       	  return 0;
         else if(o1.getAge()>o2.getAge())
       	  return 1;
         else 
       	  return -1;
	}
	
	
	
	
}


public class StreamDemo02 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1,"sachin","developer",20000,18));
		employees.add(new Employee(2,"kumar","developer",123000,35));
		employees.add(new Employee(3,"anil","hr",45000,18));
		employees.add(new Employee(4,"john","manager",84000,35));
		employees.add(new Employee(5,"rahul","hr",60000,18));
		employees.add(new Employee(6,"sourabh","developer",70000,35));
		
         employees.forEach(System.out::println);
		
		//we created age class for these 2 lines
		System.out.println("==========sorting based on age==========");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		//direct method without creating age class
		System.out.println("=============using comparing int========");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		//reverse
		System.out.println("=============reverse order========");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

		//sort by name
		System.out.println("========sort by name============");
		List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		emp.forEach(System.out::println);
		
		
		StreamDemo02 streamdemo2 = new StreamDemo02();
		streamdemo2.DeptWiseDetails(employees);
		System.out.println(streamdemo2.maxSalary(employees));
		System.out.println(streamdemo2.maxSalaryOfDep(employees,"developer"));
		System.out.println(streamdemo2.minSalaryOfhr(employees));
		
		
		employees.stream().map(e->"Name : "+e.getName()+" Salary :"+e.getSalary()+" Salary increased by 20% = "+(e.getSalary()+e.getSalary()*0.20)).forEach(System.out::println);
		List<Employee>li=employees.stream().collect(Collectors.toList());	
		
		
				
	}
	
	
	void DeptWiseDetails(ArrayList<Employee> employees) {
		 employees.stream().forEach(System.out::println);
	}

	Integer maxSalary(ArrayList<Employee> employees) {

		Integer maxSalaryOfEmp = employees.stream().map(Employee::getSalary).max(Double::compare).get();

		return maxSalaryOfEmp;

	}
	
	Integer maxSalaryOfDep(ArrayList<Employee> employees,String dept) {

		Integer maxSalaryOfDept = employees.stream().filter(e->e.getDept().equals(dept)).map(Employee::getSalary).max(Double::compare).get();

		return maxSalaryOfDept;

	}
	
	Integer minSalaryOfhr(ArrayList<Employee> employees) {

		Integer maxSalaryOfhr = employees.stream().filter(e->e.getDept().equals("hr")).map(Employee::getSalary).min(Double::compare).get();

		return maxSalaryOfhr;

	}
		
		
		
	

}
