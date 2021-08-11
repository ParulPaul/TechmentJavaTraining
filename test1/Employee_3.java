package com.test1;


class NameException extends Exception{  
	 NameException(String s){  
	  super(s);  
	 }  
	} 

public class Employee_3 {

	private  String firstName;
	private String lastName;
	
	public Employee_3(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	static void validEntry(String firstName, String lastName )throws NullPointerException{  
	     if((firstName.trim().length()==0) && (lastName.trim().length()==0)) {
	    	 throw new NullPointerException("Entry missing");  
	     }
	}
	
	static void validLength(String firstName, String lastName)throws NameException{  
	     if((firstName.trim().length()<3) && (lastName.trim().length()<3)) {
	    	 throw new NameException("Must 3 characters");  
	     }
	}
	
	public static void main(String[] args) {
		
	    try {
			Employee_3 emp1 = new Employee_3("Parul", "Paul");
	    	validEntry(emp1.firstName, emp1.lastName);
	    	validLength(emp1.firstName, emp1.lastName);	    	
	    }catch(Exception m){
	    	System.out.println("Exception occured: "+m);
	    }

	}

}
