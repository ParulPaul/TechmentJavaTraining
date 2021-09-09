package logicalAssisments;

import java.util.Scanner;

public class BinaryDecimal {
	
	public static int convert_binaryToDecimal(int binary) {
		
		 int decimal=0,power=0;

		 while(true){
		     if(binary == 0)  
		          break;
		     else {
		    	  int temp = binary%10; 
		          decimal += temp*Math.pow(2, power);  
		          binary = binary/10;    
		          power++; 
		          }
		 }
		return decimal;  
	
	}
	public static void main(String[] args) {
		
		
	Scanner scanner =new Scanner(System.in);
	
    System.out.println("Enter the binary number");
    int binary=scanner.nextInt();  
    System.out.println("Decimal="+convert_binaryToDecimal(binary));

}


}
