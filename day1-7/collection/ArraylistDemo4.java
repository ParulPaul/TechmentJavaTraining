package com.collection;

import java.util.*;

public class ArraylistDemo4 {

	
	public static void main(String args[]) {

		ArrayList<String> o1 = new ArrayList<String>();
		
		o1.add("sachin");
		o1.add("ravi");	
		o1.add("kumar");	
		o1.add("soumya");
		System.out.println("List of students in batch1" +o1);
		
		
		Collections.sort(o1);
		System.out.println("List of students after sorting in batch1" +o1);
		
		
		
		
		ArrayList<String> o2 = new ArrayList<String>();
		
		o2.add("saurabh");
		o2.add("manish");
		o2.add("sachin");
		o2.add("ankit");
		o2.add("kumar");	
		
        System.out.println("List of students in batch2 "+o2);


		Collections.sort(o2);
		System.out.println("List of students after sorting in batch1" +o2);
	
		o1.removeAll(o2);
		System.out.println("After Removing the duplicates" +o2);
	}
}
