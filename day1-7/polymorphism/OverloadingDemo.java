package com.polymorphism;

class Hello
{
	public void write(int i)
	{
		System.out.println("you have written numbers and number is" +i);
	}
	public void write(String msg)
	{
		System.out.println("you have written numbers and number is" +msg);
	}
	
	public  int add(int a, int b) {
		return a+b;
	}
	
	public  int add(int a, int b,int c) {
		return a+b+c;
	}
}


public class OverloadingDemo {
	
	public static void main(String arg[]) {
		
		Hello hello= new Hello();
		hello.write("welcome");
		System.out.print(hello.add(2, 0));
	}

}
