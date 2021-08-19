package com.techment.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge()==o2.getAge())
		return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else return -1;
	
	
}

public class StreamDemo03 {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Shikha","Developer",23000,24));
		employees.add(new Employee(2,"Ashish","Manager",42000,26));
		employees.add(new Employee(3,"Anup","Sales Executive",34000,25));
		employees.add(new Employee(4,"Raina","Developer",28000,29));
		employees.add(new Employee(5,"Shubham","HR",30000,24));
		
		
		System.out.println("Sorting based on Age");
		employees.forEach(System.out::println);
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		System.out.println("******Sorted in Ascending*****");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("******Sorted in Descending*****");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

		List<Employee>emp=employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		emp.forEach(System.out::println);
		
		
	}

}
