package logicalAssisments;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,result;
		char operators;
		
		System.out.println("Enter 1st Number:");
		num1= sc.nextInt();
		
		System.out.println("Enter 2nd Number:");
		num2= sc.nextInt();
		
		System.out.println("Enter the Operators (+,-,*,/)");
		operators= sc.next().charAt(0);
		
		switch (operators) {

	 
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	     
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	   
		
	}
}
