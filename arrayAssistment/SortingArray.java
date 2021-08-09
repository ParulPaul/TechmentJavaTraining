package com.arrayAssistment;

public class SortingArray {
	
	public static void main(String args[]) {
		
		int num[]= {100,10,20,40,60};
		int temp=0;
		
		System.out.println("Given Array:");
		for(int i =0; i<num.length;i++) {
			System.out.println(num[i]+ "");
			
		}
		for(int i =0; i<num.length;i++) {
			for(int j =i+1; j<num.length;j++)
			{
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Sorted Array:");
		for(int i =0; i<num.length;i++) {
			System.out.println(num[i]+ "");
	
		}
	}
}
