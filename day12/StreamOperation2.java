package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamOperation2 {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		//Terminal operations return a result of a certain type after processing all the stream elements.

	
		//Once the terminal operation is invoked on a Stream, the iteration of the Stream and any of the chained streams will get started. 
		//Once the iteration is done, the result of the terminal operation is returned.
		
		
		
		//Stream.forEach()
		//The forEach() method helps in iterating over all elements of a stream and perform some operation on each of them. 
		//The operation to be performed is passed as the lambda expression.

		memberNames.forEach(System.out::println);
		
		//The collect() method is used to receive elements from a steam and store them in a collection.

		List<String> memNamesInUppercase = memberNames.stream().sorted()
		                            .map(String::toUpperCase)
		                            .collect(Collectors.toList());
		         
		System.out.print(memNamesInUppercase);
		
		//Stream.match()
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		 
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		
		
		//The count() is a terminal operation returning the number of elements in the stream as a long value.

		long totalMatched = memberNames.stream()
		    .filter((s) -> s.startsWith("A"))
		    .count();
		 
		System.out.println(totalMatched);
		
		
		//The reduce() method performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.

	

		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
	}
	
	
	
	

}
