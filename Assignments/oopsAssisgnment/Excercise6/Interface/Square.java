package com.Interface;

public class Square implements Polygon {
	
	float side;
	

	@Override
	public void calcArea() {
		
		
		  
		float area = side*side;
		System.out.println("Area of square" +area);
		
	}

	@Override
	public void calcPeri() {
	
		
		float perimeter = 4*side;
		System.out.println("Perimter of square" +perimeter);
		
	}

}
