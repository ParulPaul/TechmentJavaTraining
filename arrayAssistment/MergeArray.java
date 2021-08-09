package com.arrayAssistment;

public class MergeArray {

	public static void main(String args[]) {
		
		int a[]= {2,5,8,9};
		int b[]= {15,3,7,12};
		
		int c[] = new int[a.length+b.length];
		
		int counter=0;
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
			counter++;
			
		}
		for(int j=0;j<b.length;j++) {
			c[counter++]=b[j]; 
	}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+ "");
		}
	}
}
