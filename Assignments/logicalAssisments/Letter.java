package logicalAssisments;


import java.util.Scanner;

public class Letter  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Write the message here ");
		String message = scanner.nextLine();

		System.out.println("Your message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1; //last position of array
		
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println(" all the characters, one at a time:");

		for ( int i=0; i<message.length(); i++ ){ 
		System.out.println(i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;

		for ( int i=0; i<message.length(); i++ ){
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' ){ 
				a_count++;
			}
		}

		System.out.println("Letter 'a' in a message " + a_count );

	}

}