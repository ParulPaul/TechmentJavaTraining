package com.techment.Entiity;

import java.util.StringTokenizer;

public class Cal {

	//find largest num
	public static int findMax(int arr[])
	{  
        //int max=0; 
		int max=arr[0];//arr[0] instead of 0  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	
	//method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
    
  //method that returns reverse words   
    public static String reverseWord(String str){  
  
    	//Java StringBuilder class is used to create mutable (modifiable) String
        StringBuilder result=new StringBuilder();  
        
        /**StringTokenizer class in Java is used to break a string into tokens.
        A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed.
        A token is returned by taking a substring of the string that was used to create the StringTokenizer object.
        **/
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        // StringBuilder append() method concatenates the given argument with this String.
        sb.append(tokenizer.nextToken());  
        //The reverse() method of StringBuilder class reverses the current string.
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
}
