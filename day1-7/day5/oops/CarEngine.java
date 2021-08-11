package com.day5.oops;

class Car{
	
	String carNmae;
	int model;
	Engine engine;
	
	
	public Car(String carNmae, int model, Engine engine) {
		super();
		this.carNmae = carNmae;
		this.model = model;
		this.engine = engine;
	}
	
	void displayCarDetails() {
		System.out.println("Carname :"+ carNmae);
		System.out.println("Car Model:"+ model);
		System.out.println("Engine id :"+ engine.engineId);
		System.out.println("Engine Type :"+ engine.engineType);
		
		
	}
	
}

class Engine{
	
	int engineId;
	String engineType;
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
	
}

public class CarEngine {
	
	public static void main(String args[]) {
		
		
		Engine engine = new Engine(0101,"4Stock");
		Car car= new Car("Verna",2,engine);
		car.displayCarDetails();
	}

}
