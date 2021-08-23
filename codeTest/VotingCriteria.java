package com.techment.codeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;


public class VotingCriteria {

	public static void main(String[] args) {
	
		
		// Creating an empty HashMap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 18);
        map.put(2, 12);
        map.put(3, 23);
        map.put(4, 25);
        map.put(5, 45);
        map.put(6, 32);
        map.put(7, 8);
        map.put(8, 17);
        map.put(9, 21);
        map.put(10, 28);
        System.out.println("List of people = "+map);
        
        
        System.out.println("\n\nChecking the validity");
		for (int val :map.values())
		{
			if(val>=18)
			System.out.println("Valid person age = "+val);
			else
				System.out.println("Not eligible persons with age = "+val);
		}
		
		
	
        

	}


	      
	      

	   /**     Scanner scan = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = scan.nextInt();
			
			if(age>18){
				System.out.println("Welcome to vote");
			}else{
				int shortBy = (18 - age);
				System.out.println("nt eligible for voting :"+ shortBy + " years");
			}
	
**/
}
