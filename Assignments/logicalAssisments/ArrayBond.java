package logicalAssisments;

import java.util.Scanner;

public class ArrayBond {
	
	public static void main(String[] args) {
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No. of element in array");
		n=scanner.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter array element ");
		
		for(int i=10;i<n;i++) 
		{  
			array[i]=scanner.nextInt();	
		}
		try 
		{
				System.out.print("Enter index of array");
				int i=scanner.nextInt();
				System.out.println(array[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println(e.getMessage());
		    System.out.println( e.getClass()); 
		}
		scanner.close();
	}


}
