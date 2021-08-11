package com.collection;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		
		Integer b =a; //autoboxing
		
		int c= b.intValue(); //unboxing
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
