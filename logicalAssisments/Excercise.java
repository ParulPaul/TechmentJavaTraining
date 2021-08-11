package logicalAssisments;

import java.util.Scanner;

public class Excercise {

	
public static void triangle(int side1,int side2,int side3)
		{
		
		if(side1 > side2+side3)  
			System.out.println("Triangle can be formed!");
		else if(side2 > side1+side3)
			System.out.println("Triangle can be formed!");
		else if(side3 > side2+side1)
			System.out.println("Triangle can be formed!");
		else
			System.out.println("Triangle can not be formed!");
		}
	public static void main(String[] args) {
		
		int side1,side2,side3;
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.println("Enter the first side of triangle");
		side1=scanner.nextInt();
		System.out.println("Enter the second side of triangle");
		side2=scanner.nextInt();
		System.out.println("Enter the third side of triangle");
		side3=scanner.nextInt();
		
		triangle(side1,side2,side3);
	
	}
}
