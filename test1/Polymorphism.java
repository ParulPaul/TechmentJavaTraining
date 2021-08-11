package com.test1;



class Animal
{
	
	public void shout() {
		
		System.out.println("Making Sound");
	}
}
class Dog extends Animal
{
	
	public void shout() {
		
		System.out.println("dogs Bark");
		
	}
	
}

class Horse extends Animal
{
	
	public void shout() {
		
		System.out.println("Horse shout");
		}
}

class Cat extends Animal
{
	public void shout() 
	{
		
		System.out.println("cat meow");
}

}
public class Polymorphism {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.shout();
	
	     Cat cat = new Cat();
	     cat.shout();
		
	    Horse horse = new Horse();
	     horse.shout();
	}


}