package com.exceptionhandling;

import java.io.FileNotFoundException;

class Student
{
	void checkEligibility(int age) throws FileNotFoundException
	{
		
		if(age>=18)
			System.out.println("you can apply for loan");
		else
			throw new FileNotFoundException("you cannot apply for laon");
			//throw new ArithmeticException("you cannot apply for laon");
}
	

}
public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		Student student = new Student();
		student.checkEligibility(8);
	}
}

