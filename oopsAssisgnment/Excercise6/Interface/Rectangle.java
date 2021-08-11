package com.Interface;

public class Rectangle implements Polygon {
	
	float length;
	float breadth;

	@Override
	public void calcArea() {
		
		float area = breadth*length;
		System.out.println("Area of rectangle" +area);
		
	}

	@Override
	public void calcPeri() {
		
		float perimeter = 2*(length+breadth);
		System.out.println("Perimter of rectangle" +perimeter);
		
	}

}
