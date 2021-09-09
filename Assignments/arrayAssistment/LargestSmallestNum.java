package com.arrayAssistment;

import java.util.*;

public class LargestSmallestNum {
	
	public static void main(String []args){
	      int num;
	      
	      int arr[] = {5, 3, 8, 90, 93, 79, 9, 10, 0, 12};
	      
	      System.out.println("Array = "+Arrays.toString(arr));
	      int count = arr.length;
	      for (int i = 0; i < count; i++) {
	         for (int j = i + 1; j < count; j++) {
	            if (arr[i] > arr[j]) {
	               num = arr[i];
	               arr[i] = arr[j];
	               arr[j] = num;
	            }
	         }
	      }
	      System.out.println("First Smallest: "+arr[0]);
	      System.out.println("First Largest: "+arr[count-1]);
	      System.out.println("Second Smallest: "+arr[1]);
	      System.out.println("Second Largest: "+arr[count-2]);
	   }
}


