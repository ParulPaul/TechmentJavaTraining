package com.exceptionhandling;

public class demo1 {
	
	public static void main(String args[]) {
		
		System.out.println("Name is Parul");
		System.out.println("Email is parulpaul@gmail.com");
		int arr[]=new int[5];
		try
		{
			System.out.println(1/1);
			arr[7]=24;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Dont give zero");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Dont give zero");
		}
		catch(Exception e)
		{
			System.out.println("Dont give zero");
		}
		System.out.println("contact num is 92929292929");
	}

}
