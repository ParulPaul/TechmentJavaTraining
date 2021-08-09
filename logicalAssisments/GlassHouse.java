package logicalAssisments;

import java.util.Scanner;

public class GlassHouse {
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		if (num>1 && num<18)
		{
		   System.out.println("It is Two digit number" + "\n" + "First digit is:" + num / 10 + "\n" + 
				"Second digit is:" + num % 10 + "\n" + 
                                    "Sum of digits=" + (num / 10 + num % 10));
	
		}
		}

}
