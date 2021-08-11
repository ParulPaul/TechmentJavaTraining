package com.exceptionhandling;



public class ThrowsDemo1 {

	
	class Student
	{
		void checkEligibility(int age) 
		{
			
			if(age>=18)
				System.out.println("you can apply for loan");
			else
				
		throw new ArithmeticException("you cannot apply for loan");
	}
		

	}
	public class ThrowsDemo {

		public void main(String[] args)  {
			
			Student student = new Student();
			student.checkEligibility(19);
		}
}

}	