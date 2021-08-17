package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamDemo4 {
	
	public static void main (String args[]) {
		
		
		
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		
		    //count -     
		long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count();
		System.out.println(noOfBigNames);
		         
		List<String> first3Names = names.stream().limit(3).collect(Collectors.toList());
        System.out.println(first3Names);
        
        
      //Storing first 3 names in an array
        Object[] streamArray = names.stream().limit(3).toArray();
        System.out.println(Arrays.toString(streamArray));
        
        /**peek-Performs an additional action on each element of a stream. 
        This method is only to support debugging where you want to see the elements as you pass in a pipeline.
         map()- returns a stream consisting of the results of applying the given function to the elements of this stream.
        **/
        names.stream()
        .filter(name -> name.length() > 5)
        .peek(e -> System.out.println("Filtered Name :"+e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped Name :"+e))
        .toArray();
        
        
        //anyMatch() : Any one element matches
        //allMatch() : All elements matches
        //noneMatch() : No element matches
       if(names.stream().anyMatch((String name) -> name.length() == 5))
        {
            System.out.println("Yes... There is a name exist with 5 letters");
        }
        
       else  if(names.stream().allMatch((String name) -> name.length() > 5))
        {
            System.out.println("All are big names");
        }  
        
       else{
    	  // (names.stream().noneMatch((String name) -> name.length()== 2));
       
       }
    System.out.println("There is no two letter name");
        
       
	}
}	         