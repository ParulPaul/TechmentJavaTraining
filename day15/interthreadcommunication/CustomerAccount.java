package com.techment.day15.interthreadcommunication;

public class CustomerAccount {
	
	int balance=0;
	
	
	synchronized public int withdraw(int amount)
	{
		
		if(amount>balance) 
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() +"is going to withdraw");
		 balance-=amount; //balance = balance-amount
		
		return balance;
	}
	
	
	synchronized public int deposit(int amount) {
		
		System.out.println(Thread.currentThread().getName() +"is going to deposit");
		
		return balance;
	}

}
