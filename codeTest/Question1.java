package com.techment.codeTest;

public class Question1 {

	public String repeatFront(String str, int n) {
		
		
		int len = str.length();
		
		  String word = "";
		
		     for (int i = n; n > 0; n--){
		
		    word += str.substring(0,n);
		
		  }
		
		  return word;	
		
	}

public static void main(String[] args) {
	  
    Question1 q1=new Question1();
    System.out.println(q1.repeatFront("Chocolate", 5));
    System.out.println(q1.repeatFront("Chocolate", 3));
    System.out.println(q1.repeatFront("Chocolate", 2));
    
    
}
}