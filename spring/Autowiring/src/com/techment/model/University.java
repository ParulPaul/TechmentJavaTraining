package com.techment.model;

public class University {
	
	Department department;
	int noOfstudents;
	
	
	public void setNoOfstudents(int noOfstudents) {
		this.noOfstudents = noOfstudents;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



public	void displayDeptDetails() {
		
		department.deptDetails();
		System.out.println("no of students:"  +noOfstudents);
	
	
	
}
}
