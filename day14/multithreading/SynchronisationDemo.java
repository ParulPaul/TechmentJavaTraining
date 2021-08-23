package com.techment.day14.multithreading;

class Water
{
	 synchronized public void drinkWater(int time) {
		
		
		for(int i=1;i<=time;i++) {
			
			System.out.println(Thread.currentThread().getName() +" is drinking water" + "times");
		}
	}
	
}


 class WaterBottle extends Thread
{

	Water water = new Water();
	
	@Override
	public void run() {
		
		 water.drinkWater(5);
	}
	


} 


public class SynchronisationDemo {

	public static void main(String[] args) {

		
		
		WaterBottle waterbottle = new WaterBottle();
	
		Thread person1= new Thread(waterbottle);
		Thread person2= new Thread(waterbottle);
		
	
		
		person1.setName("parul");
		person2.setName("sanaika");
		
		person1.start();
		person2.start();

	}

}
