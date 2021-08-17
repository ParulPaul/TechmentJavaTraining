package com.techment.day12.newfeature;

interface Calculation1{
	//void add(int a,int b);
	String add(int a,int b, int c);
}
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		//lamda expression with parameter
		/**
		Calculation cal=(a,b)->System.out.println("Result "+(a+b));
		cal.add(2,3);
		cal.add(4,5);
		*/
		
		//single line body no needof return
		//Calculation1 cal1=(a,b,c) -> a+b;
		
		Calculation1 cal2=(a,b,c)->{
			if(a>b && a>c )
				return "a is largest ";
			else if(a<b && b>c)
				return "b is largest";
			else 
				return "c is largest";
				
		};
		System.out.println(cal2.add(2,4,4));
		System.out.println("largest of two element  : "+cal2.add(12, 4,5));
		}
	
}