package com.techment.day12.newfeature;


//@FunctionalInterface  
interface Bank{
	
	void rateofInterest();//it contians only one abstract method
	
	default void display() {
		
		System.out.println("this is a default method");
	}
	
	static void loan() {
		
		System.out.println("you can apply for load");
	}
}


public class FunctionalinterfaceDemo {

	public static void main(String[] args) {
	
		
		
		
	}

}
