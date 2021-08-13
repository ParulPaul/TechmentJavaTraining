package logicalAssisments;

import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length of fisrt side of triangle: ");
		double side1 = scanner.nextDouble();
		
		System.out.print("Enter length of  second side of triangle :  ");
		double side2 = scanner.nextDouble();
		
		System.out.print("Enter length of third side of triangle:  ");
		double side3 = scanner.nextDouble();
		
		double semiPerimeter =  (side1+side2+side3)/2;
		
		System.out.println("semiPerimeter = "+semiPerimeter);
		
		double area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
		
		
		System.out.println("Area of triangle  = "+area);
		

	}

}
