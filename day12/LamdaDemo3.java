package com.techment.day12.newfeature;

interface Bank1
{
	
	void display();
	
}
public class LamdaDemo3 {

	public static void main(String[] args) {
		
		System.out.println("this is single line display");
		Bank1 bank =()->System.out.println("this is display method");

		bank.display();
		Bank1 bank2=()->{
			System.out.println("\nthis is multi line display");
			System.out.println("this is display bank2");
		};
		bank2.display();
	}

}