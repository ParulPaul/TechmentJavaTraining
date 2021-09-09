package logicalAssisments;

import java.util.*;

class InvalidAgeException1 extends Exception 
{
	
	public InvalidAgeException1(String str) {
		
		System.out.println(str);
	}
}




public class InvalidAgeException{
	
	
	public static void main(String args[]) throws Exception {
		
		
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter your age");
	int age= sc.nextInt();
	
	
	try 
	{
		if(age>18)
			throw new Exception("Invalid age");
		else
			System.out.println("Valid age");
	}
	catch(InvalidAgeException1 e) {
	System.out.println(e);
	}
	}
	
	
}