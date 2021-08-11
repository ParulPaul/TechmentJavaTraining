package com.polymorphism;

class Bank
{
	public void rateOfInterest() 
	{
	System.out.println("3%");
	}
}

class SBI extends Bank
{
	public void rateOfInterest() 
	{
	System.out.println("6%");
	}
}

class Axis extends Bank
{
	public void rateOfInterest() 
	{
	System.out.println("9%");
	}
}

public class Overridding1
{

	public static void main(String args[])
	{
		SBI sbi = new SBI();
		Axis axis = new Axis();
		
		sbi.rateOfInterest();
		axis.rateOfInterest();
	}
	

}