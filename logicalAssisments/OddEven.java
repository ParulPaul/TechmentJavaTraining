package logicalAssisments;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the day of month");
		
		int day = sc.nextInt();
		
		for(int i =1;i<=31;i++) 
		{
		 if(day%2==0)
			{
				System.out.println("Cars with Even registration");
				
			}
			else
			{
				System.out.println("Cars with Odd registration numbers are permitted today" );
			}
			
		}
		}
	

}
