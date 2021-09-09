package logicalAssisments;

import java.util.Scanner;

public class NumberPyramid {
	

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter interger for priniting:  ");
	int rowNumber = scanner.nextInt();
	
	 int rowCount = 1;
	 		        	 
        for (int i = rowNumber; i >= 1; i--)
        {
           
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            for (int j = i; j <= rowNumber; j++)          
            {
                System.out.print(j+" ");
            }
  
            for (int j = rowNumber-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
             
            System.out.println();
 
          
 
            rowCount++;
        }
	
}

	
}