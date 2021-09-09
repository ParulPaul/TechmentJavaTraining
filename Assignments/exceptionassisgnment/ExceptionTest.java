package com.exceptionassisgnment;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	
public static void main(String args[]) {
		
	 int num1;
     int num2;
     float result;
     Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter numerator:");
     num1 = scanner.nextInt();
     System.out.println("Enter denominator:");
     num2 = scanner.nextInt();
     try 
		{ 
             result=num1/num2;
	     System.out.println(result);
		}  
		
     catch (ArithmeticException e)
     {
    	 System.out.println("Division with 0 is not possible");
     }

     catch (InputMismatchException e)  
		{ 
			System.out.println("Only Integers are allowed"); 
		} 
     catch (NullPointerException e)
     {
    	 System.out.println("No input received");
     }
    

  
 
}
}