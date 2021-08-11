package com.customexception;

public class Account {

	int balance=50000;
	int withdraw(int amount)
	{
		if (account>balance)
           throw new InSufficientFundException("insufficient fund");
		else
			System.out.println("withdrawn succesfully");
	}

}
