package com.techment.day12.newfeature;

import java.util.ArrayList;

public class StreamDemo1 {
	
	public static void main(String args[]) {
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(29);
		nums.add(30);
		
		System.out.println(nums);
		
		nums.stream().forEach(s->System.out.println(s));
		
		//by method reference
		nums.stream().forEach(System.out::println);
		
		
	}

}
