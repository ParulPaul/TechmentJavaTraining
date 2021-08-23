package com.techment.codeTest;

import java.util.Scanner;

class Person{
	
	int id;
	String name;
	int age;
	
}


 public class ExceptionHandling extends Exception
{

  ExceptionHandling(String str)
  {
	super(str);
  }



 public static void validate() throws ExceptionHandling
  { 
	 int age;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your age");
       age = sc.nextInt();

        if(age < 18)  
     throw new ExceptionHandling("Age of a person should be above 15");  
        
  }  
 
 public static void validate1() throws ExceptionHandling
 { 
	 int name;
	 int length=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your name");
      name = sc.nextInt();
    
    	   if(length < 3)
  	    throw new ExceptionHandling ("name must be greater than 3 characters ???");
 } 
 
 



public static void main(String[] args)
	{
		try
		{  
			validate(); 
 

			try
			{
				validate1();
			}
			catch(Exception e)
				{
				System.out.println("Caught an Exception: "+e);
				}  

			finally 
			{
	
				System.out.println("");
			}
		}

		

      }


}