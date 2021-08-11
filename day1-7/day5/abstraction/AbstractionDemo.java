package com.day5.abstraction;


abstract class Bank{   //parent class
	
	void Eligibilty() {
		
		System.out.println("above 18 can open an account");
		
	}
	abstract int rateOfInterest(int interestRate);
	
}

//when any class extends abstract class means, it needs to be implemented for abstract class.

class AxisBank extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("axis bank" + interestRate);
		return interestRate;
	}
	
}

class KotakBank extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("kotak bank" + interestRate);
		return interestRate;
	}
	
}



public class AbstractionDemo {
	
	public static void main(String args[]) {
		
		Bank bank =new KotakBank();
		System.out.println(bank.rateOfInterest(5));
		
	}
	
}
