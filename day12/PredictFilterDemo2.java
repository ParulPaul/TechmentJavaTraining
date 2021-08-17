package com.techment.day12.newfeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredictFilterDemo2 {

	public static void main(String argd[]) {
		
	     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	     List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

	        System.out.println(collect); 
	}
}
