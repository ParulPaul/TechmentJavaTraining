package com.techment.day15.interthreadcommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
	
		CustomerAccount account = new CustomerAccount();
		Thread t1 = new Thread()
		{
	public void run()
	{
		account.withdraw(3000);
	}
		};
		
Thread t2 = new Thread()
		{
	public void run()
	{
		System.out.println("after deposit balance: "+ account.deposit(7000));
	
	
	}
		};
		
		t1.setName("ATM");
		t2.setName("Bank");
		
		t1.start();
		t2.start();

}
		
	
}


