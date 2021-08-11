package com.test1;

public class Employee_2 {
	
	String firstName;
	String secondName;
	
	

	public Employee_2(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}



	@Override
	public String toString() {
		return "Employee_2 [firstName=" + firstName + ", secondName=" + secondName + "]";
	}

  public void display() {
	  
	
	  System.out.println("enter the  first name"  +firstName);
	  System.out.println("enter the last name"  +secondName);
	  
	
	 
}

	public static void main(String[] args) {
		
		Employee_2 employee = new Employee_2("Parul","paul");
		Employee_2 employee1 = new Employee_2("shephali","paul");
		Employee_2 employee2 = new Employee_2("rajesh","paul");
		employee.display();
		employee1.display();
		employee2.display();
		
	}

}
