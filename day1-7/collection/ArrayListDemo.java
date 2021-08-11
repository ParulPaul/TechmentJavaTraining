package com.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String arg[]) {
		
	
		ArrayList obj = new ArrayList();
		System.out.println("size before adding element:" +obj.size());
		obj.add(1);
		obj.add("Sachin");
		obj.add(24.50);
		
		System.out.println("size after adding element:" +obj.size());
	    System.out.println("element in the list" +obj);
	
	    obj.add(1,"hello");
	    System.out.println("element in the list agter  adding at 1st index "+ obj);

	
	obj.remove(1);
	System.out.println("element in the list after removing" +obj);
	
	obj.remove(Integer.valueOf(1));
	System.out.println("element in the list after removing" +obj);
	
	System.out.println("element at 2nd index" +obj.get(20));
	}
	
	
	
}
