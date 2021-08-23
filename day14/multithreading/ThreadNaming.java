package com.techment.day14.multithreading;

class Apple extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==2)
			{
				stop();
			}
		System.out.println("eat apple" +  Thread.currentThread().getName());
		}
	}
}

class Banana extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++) {
			
		}
		System.out.println("eat banana" +  Thread.currentThread().getName());
	
	}
}

public class ThreadNaming {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		//apple.run();
		//banana.run();
		
		
		apple.setName("apple thread");
		banana.setName("banana thread");
		
		apple.start();
		banana.start();
		
		banana.setPriority(2);
		apple.setPriority(8);
		
		//banana.suspend();
		//banana.resume();

	}

}
