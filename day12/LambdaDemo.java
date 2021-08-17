package com.techment.day12.newfeature;

interface Bank2  //funtional interface
{
	void display();
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		Bank2 bank =()->System.out.println("this is display method");
		bank.display();
		
		Bank2 bank2 =()->
		{
			System.out.println("this is display method");
			System.out.println("this is multi line method");

		};
		bank2.display();

	}

}