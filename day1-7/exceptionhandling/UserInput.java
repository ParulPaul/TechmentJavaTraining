package com.exceptionhandling;

import java.util.*;

public class UserInput {

	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);			
		
		
		try {
				
			System.out.println("Enter the first num");
			int num1=sc.nextInt();
			System.out.println("Enter the second num");
			int num2=sc.nextInt();
			
			int result=num1/num2;
			System.out.println("Result" +result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Do not give 0");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Dont give characters");
		}
	}

}
