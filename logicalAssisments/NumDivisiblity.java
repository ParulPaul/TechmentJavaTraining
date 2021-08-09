package logicalAssisments;

import java.util.Scanner;

public class NumDivisiblity {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int i = sc.nextInt();
			if(i%8 == 0 && i%3 == 0)
			{
				System.out.println("It is divisible by 8 and 3 both");
			}
			else if(i%8 ==0 || i%3 ==0) 
			{
				System.out.println("It is divisible by eithet 8 or 3 but not both");
			}
					
	}

}
