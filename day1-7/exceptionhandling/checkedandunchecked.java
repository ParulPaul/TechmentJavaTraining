package com.exceptionhandling;

import java.io.FileNotFoundException;

public class checkedandunchecked {

	public static void main(String[] args) throws FileNotFoundException{ 
		{
		 
		//throw new ArithmeticException("Something went wrong")

		throw new FileNotFoundException("File not found");
	       }
		}

}
