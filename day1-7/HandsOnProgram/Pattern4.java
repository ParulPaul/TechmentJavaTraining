package HandsOnProgram;

import java.util.Scanner;

public class Pattern4 {
	
public static void main(String arg[]) {
		
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int row=sc.nextInt();
		
		
		for(int i=1; i<=row;i++)
		{
			for(int j=1; j<=row;j++)
			{
				if(i==j)
				System.out.print( "*");
				else
					System.out.print("    ");
			}
			System.out.println("");
		}
		
}
}
