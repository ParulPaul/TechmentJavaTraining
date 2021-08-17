package com.techment.day12.newfeature;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemoexample1 {

	public static void main(String[] args) {
		
		     {
		    	 
		    	 //Stream.of
		         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		         stream.forEach(p -> System.out.println(p));
		     
		
		         	//stream.of(array)
              Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
	         stream1.forEach(s -> System.out.println(s));
		     }
		     
		     
		     //	Stream.generate() or Stream.iterate()
		     Stream<Integer> randomNumbers = Stream
		             .generate(() -> (new Random()).nextInt(100));
		 
		         randomNumbers.limit(20)
		              .forEach(System.out::println);
		     }

}