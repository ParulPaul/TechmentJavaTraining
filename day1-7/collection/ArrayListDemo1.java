package com.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();//can store any type of object
		a1.add(1);
		a1.add("sachin");
		
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(); //default capacity=10
		a2.add(1);
		//a2.add("sachin");
		
		
		ArrayList<String> a3 = new ArrayList<String>(); //default capacity=10
		a3.add("sachin");
		//a3.add(1);
		
		
	}
	

}
