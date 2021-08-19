package com.techment.day13.newFeature;


@FunctionalInterface
interface Calculate{
	
	int add(int a, int b);
	
}


//method reference

class CalculationUtil{
	
	int addition(int a, int b) {
		return a+b;
	}
	int Substract(int a, int b) {
		
		return a-b;
		
	}
}
/**
class Sub{
	
	int Substract(int a, int b) {
		
		return a-b;
		
	}
}
**/
public class MethodRefernce2 {

	public static void main(String[] args) {
	// using lambda
		
		Calculate cal = (a,b)-> a+b;
		System.out.println(cal.add(2, 4));
		
		Calculate cal2 = (a,b)-> a-b;
		System.out.println(cal2.add(12, 4));
		
	/**	
		// by using method reference
		Add add =new Add();
		Calculate cal3=add::addition;
		System.out.println(cal3.add(3, 80));
		
		Sub sub=new Sub();
		Calculate c2= sub::Substract;
		System.out.println(c2.add(3, 2));
		
		**/
		
		
		CalculationUtil calculationutil = new CalculationUtil();
		Calculate c1=calculationutil ::addition;
		Calculate c2=calculationutil ::Substract;
		
		System.out.println(c1.add(1, 11));
		System.out.println(c2.add(1, 1));
		
	}

}
