package com.exceptionhandling;


class AgeException01 extends RuntimeException
{
	
	String msg;
	

	public AgeException01(String msg) {
		super();
		this.msg = msg;
	}

}

class IdNotFoundException01 extends Exception {

	String msg;

	public IdNotFoundException01(String msg) {
		super();
		this.msg = msg;
	}
}
public class CustomException1  {
	
	
	public static void main(String args[]) throws IdNotFoundException01  {
		
	
     	throw new IdNotFoundException01 ("not a valid age");
	}

}

