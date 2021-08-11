package com.collection;

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
      ArrayList <Integer>o1= new ArrayList<Integer>();
      o1.add(1);
      o1.add(2);
      o1.add(3);
      o1.add(4);
      
      System.out.println("elements of o1" +o1);
		
      for(Integer o:o1) {
    	  
    	  System.out.println(o);
      }
	}

}
