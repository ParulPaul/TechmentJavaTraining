package com.techment.day12.newfeature;

import java.util.function.Predicate;

public class PredicateDemo {
	
	static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    } 

	public static void main(String[] args) {
		
		// Using Predicate interface  
        Predicate<Integer> predicate =  PredicateDemo ::checkAge;  
        // Calling Predicate method  
        boolean result = predicate.test(25);  
        System.out.println(result);  
	}

}
