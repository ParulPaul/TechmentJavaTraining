package com.techment.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(10);
		nums.add(20);
		nums.add(15);
		nums.add(12);
		
		System.out.println(nums);
	
		nums.forEach(s->System.out.println(s));
		
		nums.forEach(System.out :: print);
		
		nums.forEach(System.out :: println);
		
		
		//sort
		System.out.println("after sorting");
		nums.stream().sorted().forEach(System.out::println);
		
		List<Integer> mySorted= nums.stream().collect(Collectors.toList());
		System.out.println(mySorted);
		
		List<Integer> myReverse=nums.stream().sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(myReverse);
		
		
		
		
		
		
	}
	
	

}
