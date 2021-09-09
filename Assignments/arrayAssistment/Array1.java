package com.arrayAssistment;

import java.util.*;

public class Array1 {
	
	
	public static void main(String args[]) {
		
		int arr[]= {1,4,34,56,7};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number :");
		
		int num=sc.nextInt();
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num) {
				c=i+1;
				break;
			}
		}
		
		if(c!=0) {
			System.out.println(c);
	
		}else {
			System.out.print(-1);
		}
		
	}

}
