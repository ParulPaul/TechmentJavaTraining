package logicalAssisments;

import java.util.Scanner;

public class Fascinating {
	public static void fascinatingNum(int n)
	{  
		int count=0;
		String val=""+n +(n*2)+(3*n);
		
		for(int i=1;i<=9;i++)
		{
			int pos=val.indexOf(i);
			if (val.substring(pos+1).indexOf(i) >= 0) 
		
		
		if(count ==0)
			System.out.println(n +" It is a fascinating number!");
		else
			System.out.println(n +" It is NOT a fascinating number!");
		}
		
	}
	public static void main(String[] args) {
		
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		num=scanner.nextInt();  
		
		if(num>=100 && num<=999)
			fascinatingNum(num); 
		else
			System.out.println("Entered number is not 3 digit number");

	}
}
