package logicalAssisments;

import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {
		int password =12345;
		int count=0;
		while(true) 
	
		{	
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your five digit ATM pin: ");
			int ATMPin = scanner.nextInt();
			
			if(ATMPin==password)
			{
				System.out.println(" PIN ACCEPTED. YOU NOW ,HAVE ACCESS TO YOUR ACCOUNT");
				break;
			}
			else
				{
				count++;
				System.out.println("You entered wrong pin number Please enter again: ");
				if(count==3)
					{
					System.out.println("YOU HAVE RUN OUT OF TRIES.ACCOUNT LOCKED.");
					break;
					}
				}
		}
	}

}
