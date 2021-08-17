package com.techment.day12.newfeature;


interface Calculation
{
	void add(int a,int b);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		
		//lambda expression with parameter
		Calculation calculation = (a,b)-> System.out.println("Result : " +   (a+b));
		
		calculation.add(2, 40);
		calculation.add(4, 4);
		
	}

}
