package logicalAssisments;

import java.util.Scanner;

public class ValidPin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pin = 12345;

		
		System.out.print("Enter your pin: ");
		int entry = sc.nextInt();

		while ( entry != pin )
		{
			System.out.println("Incorrect pin, Re-enter the pin");
			System.out.print("Enter your pin ");
			entry = sc.nextInt();
		}

		System.out.println("\nCorrect pin");
	}

}
