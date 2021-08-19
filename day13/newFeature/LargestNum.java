package com.techment.day13.newFeature;

interface LargeNumber
{
	int largest(int a, int b, int c);
}

class Cal
{
	int findLargest(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c) 
		return b;
		else
			return c;
	}
}

public class LargestNum {

	public static void main(String[] args) {
		// by suing lambda function
		LargeNumber largenumber = (a,b,c)->{
			if(a>b && a>c)
				return a;
			else if(b>a && b>c) 
			return b;
			else
				return c;
			
		};
		System.out.println(largenumber.largest(9, 11, 2));
		
		Cal calculationutil = new Cal();
		LargeNumber l = calculationutil::findLargest;
		System.out.println(l.largest(99, 20, 55));
		
		
		

	}

}
