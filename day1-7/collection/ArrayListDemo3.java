package com.collection;

import java.util.*;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		
		o1.add(1);
		o1.add(2);	
		o1.add(3);	
		o1.add(4);
		
		System.out.println("element of o1" +o1);
		
		
		
ArrayList<Integer> o2 = new ArrayList<Integer>();
		
		o2.add(101);
		o2.add(102);
		o2.add(100);
		o2.add(2);	
		o2.add(3);	
		o2.add(4);
		
		//o2.add(266);
		//o2.addAll(o1);
		
		System.out.println("element of o2 "+o2);

		//o2.removeAll(o1);
		//o2.retainAll(o1);
		
		//System.out.println("after removing element of o1 "+o2);
		System.out.println("after retaining element of o1 "+o2);
		
		
		Collections.sort(o2);
		System.out.println("element of o2 after sorting "+o2);
		
	
	}

}
