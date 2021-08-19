package com.techment.day13.newFeature;

@FunctionalInterface
interface Cal1{
	
   int add(int a, int b);
	
}


//method reference

class CalUtil1{
	
	int addition(int a, int b) {
		return a+b;
	}
	
	static int Substract(int a, int b) {
		
		return a-b;
		
	}
}

public class MethodReference3 {

	public static void main(String[] args) {
		
		Cal1 c2 =  CalUtil1:: Substract;
		c2.add(2,2);
	}

}
