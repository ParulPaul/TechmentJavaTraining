package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		//Intermediate operations return the stream itself so you can chain multiple methods calls in a row.
		
		
		//The filter() method accepts a Predicate to filter all elements of the stream. 
		//This operation is intermediate which enables us to call another stream operation (e.g. forEach()) on the result.
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);
		
		
		//The map() intermediate operation converts each element in the stream into another object via the given function.
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);    

		
		//The sorted() method is an intermediate operation that returns a sorted view of the stream. 
		//The elements in the stream are sorted in natural order unless we pass a custom Comparator.

		memberNames.stream().sorted()
		                    .map(String::toUpperCase)
		                    .forEach(System.out::println);
	}

}
