package com.techment.day13.newFeature;

interface Calculation{// function interface
	
	void display();// abstract method
	
}
class Hello{
	
	void message() {
		
		System.out.println("today is holiday");
	}
}


public class MethodReference {

	public static void main(String[] args) {
		
		
		//by using lambda function
		Calculation calculation = ()-> System.out.println("this is dislpaly method");
		calculation.display();
		
		//method reference or non static
		Hello hello = new Hello();
		Calculation calculation2 = hello ::message;
		calculation2.display();
		
	}

}
