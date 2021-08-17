package com.techment.day12.newfeature;


/***
 * Streams are the pipeline to process the data.
 * Streams can be defined as a sequences of elements from a source which support data processing operations
 * Streams doesn’t store the data. You can’t add or remove elements from streams. Hence, they are not the data structures.
 *  They are the just operations on data.
 *  
 *  
 *  INTERMEDIATE OPERATIONS-The operations which return stream themselves are called intermediate operations. 
 *  For example – filter(), distinct(), sorted() etc.

   TERMINAL OPERATIONS-The operations which return other than stream are called terminal operations.
    count(). min(), max() are some terminal operations.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
	
		List<Students> names = new ArrayList<Students>();
        
		
		names.add(new Students("David"));
		names.add(new Students("Johnson"));
		names.add(new Students("Samontika"));
		names.add(new Students("Brijesh"));
		names.add(new Students("John")); 
		names.add(new Students("Parul"));
		names.add(new Students("Jolly"));
		names.add(new Students("Shephali"));
		names.add(new Students("Rohit"));
		names.add(new Students("Puja")); 
		names.add(new Students("Parul"));
		names.add(new Students("Jolly"));
		names.add(new Students("Shephali"));
		
		

		//Selecting only unique names
		 names.stream().distinct().forEach(s->System.out.println("names :" 
				 +s.getName()));
       
		        
      //Selecting first 4 names- Returns a stream containing first n elements.
         names.stream().limit(4).forEach(s->System.out.println("First 4 names :" 
				 +s.getName()));
		
       //Selecting first 6 names- Returns a stream containing first n elements.
         names.stream().limit(6).forEach(s->System.out.println("First 6 names :" 
				 +s.getName()));
		
       //Skipping first 4 names-Returns a stream after skipping first n elements.
         names.stream().skip(4).forEach(s->System.out.println("Skipping First 4 names :" 
				 +s.getName()));
       
         //Sorting a List of Strings with Stream.sorted()
        //  names.stream().sorted().forEach(s->System.out.println("Sorting :" +s.getName()));
         
   
         /***
          * Collectors is a final class that extends Object class.
          *  It provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc
          * */
         
         List<String> list = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
         List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

         System.out.println(sortedList);
         
         
         Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon").stream().sorted().forEach(System.out::println);
    
         // reduce() : Produces a single value
         int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(0, (a, b) -> a+b);
         System.out.println(sum);
         
	}
	
	
	
	
	
	
	

}
