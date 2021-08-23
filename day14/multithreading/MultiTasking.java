package com.techment.day14.multithreading;

class Sanika extends Thread
{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("sanika:" +i+ " msg :welcome to bangalore");
		}
	}
}


class Parul extends Thread
{
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("parul:" +i+ "msg :welcome to bangalore");
		}
	}
}


class Amit extends Thread
{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("amit:" +i+ "msg :welcome to bangalore");
		}
	}
}
public class MultiTasking {

	public static void main(String[] args) {
		
		Sanika sanika = new Sanika();
		Parul parul = new Parul();
		Amit amit = new Amit();
		
		
	//	sanika.run();
		//parul.run();
		//amit.run();
		
		
		
		sanika.start();
		parul.start();
		amit.start();
	}

}
