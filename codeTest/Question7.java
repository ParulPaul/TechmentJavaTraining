package com.techment.codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question7 {
	
	public static void main(String[] args) {

		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(0);
		arr.add(5);
		//arr.add(6);
		arr.add(3);
		
		
		if(arr.size()==10)
		{
			List<Integer> arr1=arr.subList(0, 5);
			List<Integer> arr2=arr.subList(5, 10);
			System.out.println(arr1);
			System.out.println(arr2);
		}
		else if(arr.size()==11)
		{
			List<Integer> arr3=arr.subList(0, 6);
			List<Integer> arr4=arr.subList(7, 11);
			System.out.println(arr3);
			System.out.println(arr4);
			
			
		}
		
		
		
	}




}