package com.test;

import com.Interface.Polygon;
import com.Interface.Rectangle;
import com.Interface.Square;

public class Test {
	
	public static void main(String ars[]) {
		
		Polygon polygon= new Square();
		polygon.calcArea();
		polygon.calcPeri();
		
		Polygon polygon1= new Rectangle();
		polygon1.calcArea();
		
	}

}
