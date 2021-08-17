package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			numbers.add(i);
		}
		System.out.println("numbers" +numbers);
		
		
		System.out.println("printing onle even numbers" );
		numbers.stream().filter(num->num%2==0).forEach(s->System.out.println(s));
	
	
	    List<Integer> nu=Arrays.asList(1,2,4);
	    System.out.println(nu);
	
	    System.out.println("by using map");
		numbers.stream().map(num->num+5).forEach(s->System.out.println(s));
		
		
		numbers.stream().map(num->num+100).forEach(s->System.out.println(s));
		numbers.stream().map(num->"after adding 100:+ (num+100)).forEach(s->System.out.println(s)");
		
		numbers.stream().map(num->num+5).forEach(s->System.out.println(s));
		
	
	
	}
	
	
	
	

}
