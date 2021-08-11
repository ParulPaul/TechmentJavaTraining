package com.polymorphism;


class Bank
{
	public void rateOfInterest() 
	
	{
	  System.out.println("3%");
	}
	
	public void openAccount() {
		System.out.println("open account");
	}
	
}

class SBI extends Bank
{
	public void rateOfInterest() 
	{
	  System.out.println("6%");
	}
	
	public void loan() 
	{
	  System.out.println("you can apply for loan");
	}
	
}

class Axis extends  Bank
{
	public void rateOfInterest() 
	{
	System.out.println("9%");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		
		Bank bank = new Axis(); //upcasting
		bank.rateOfInterest();
		//bank.loan(); // not access child sbi class method
		bank.openAccount();
			//SBI sbi = new SBI();
			//Axis axis = new Axis();
			
			//sbi.rateOfInterest();
			//axis.rateOfInterest();
		}
	}



