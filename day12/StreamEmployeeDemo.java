package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamEmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"sachin","developer",20000,18));
		employees.add(new Employee(2,"kumar","developer",123000,35));
		employees.add(new Employee(3,"anil","hr",45000,18));
		employees.add(new Employee(4,"john","manager",84000,35));
		employees.add(new Employee(5,"rahul","hr",60000,18));
		employees.add(new Employee(6,"sourabh","developer",70000,35));
		
		employees.stream().forEach(s->System.out.println(s));
		
		//to count no of employee
		Long empcount = employees.stream().count();
		System.out.println("total number of emolyess are"+ empcount);
		
		Long devCount = employees.stream().filter(e->e.getDept().equals("developer")).count();
		System.out.println("Employees sorted regarding developer"+ empcount);
		
		employees.stream().filter(e->e.getDept().equals("developer"))
		.forEach(e->System.out.println("names:" +e.getName()));
		
		List<Employee> emp =employees.stream().filter(e->e.getDept().equals("developer"))
		.collect(Collectors.toList());
		System.out.println(emp);
		
		//employees.stream().collect(Collectors.averagingInt());
		
		long numOfEmployee=employees.stream().collect(Collectors.counting());
		System.out.println("no of employee" +numOfEmployee);
		
		
		
		Long totalSalary = employees.stream().collect(Collectors.summarizingInt(Employee :: getSalary )).getSum();
		System.out.println("total salary" +totalSalary);
		
		int maxSalary = employees.stream().collect(Collectors.summarizingInt(Employee :: getSalary )).getMax();
		System.out.println("salary" +maxSalary);
		
		
		int minSalary = employees.stream().collect(Collectors.summarizingInt(Employee :: getSalary )).getMin();
		System.out.println("minimum employee" +minSalary);
		
		
		StreamEmployeeDemo obj = new StreamEmployeeDemo();
	    List<Employee> empDepts	= obj.filterByDept(employees, "developer");
		System.out.println(empDepts);
		
		}
	  
	
		List filterByDept(ArrayList<Employee> empList, String dept)
		{
		List<Employee> emp = empList.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return empList;
		
		
		}

}
