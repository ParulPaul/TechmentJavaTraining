package com.customexception;

public class Customexception {

	public static void main(String arg[]) {
		
		Account account = new Account();
		
		try {
			System.out.println(account.withdraw(20000));
		}
		catch (InSufficientFundException e) {}
		System.out.println(e.getMessage);
		
				}
	
	}


