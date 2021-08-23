package com.techment.codeTest;

public class Question2 {

	  public String repeatEnd(String str, int n)

      {
           String word = str.substring(str.length() - n);
                      
           for (int i = 1; i < n; i++)
                  word = word + str.substring(str.length() - n);
                  return word;
      }
      public static void main(String[] args) {
    	  
           Question2 r=new Question2();
           System.out.println(r.repeatEnd("Hello", 3));
           System.out.println(r.repeatEnd("Hello", 2));
           System.out.println(r.repeatEnd("Hello", 1));
      }



}
