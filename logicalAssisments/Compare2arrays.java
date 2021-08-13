package logicalAssisments;

import java.util.Scanner;
import java.util.Arrays;

public class Compare2arrays {
	
	public static void main(String args[] ) {
		   
		 

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter odd number  ");
		int number = scanner.nextInt();
		
		
		
			if(number%2!=0)	
			{	if(number<=15)
				{	System.out.println("numbers to compare "+number);
					
					int arr1[] = new int[number];
					
					Scanner scanProducts = new Scanner(System.in);
					
					for(int i=0;i<number;i++)
					{	System.out.print(" value are "+(i+1)+"  ");
					arr1[i] = scanProducts.nextInt();
					}
					
					for(int j=0;j<number;j++)
					{	System.out.println("values are  "+(j+1)+" is = "+arr1[j]);
					}
				
					int arr2[] = new int[number];
					
					Scanner scanProducts2 = new Scanner(System.in);
					
					for(int i=0;i<number;i++)
					{	System.out.print("value ares  "+(i+1)+"   ");
						arr2[i] = scanProducts2.nextInt();
					}
				
					for(int j=0;j<number;j++)
					{	System.out.println("value are  "+(j+1)+" is = "+arr2[j]);
					}	
					
					if (Arrays.equals(arr1, arr2))
			            System.out.println("Same");
			        else
			            System.out.println("Not same");
					
					
					
				}
				else
					System.out.println("Please enter between 1 to 15 = "+number);
			
			}
			else
				System.out.println("Please enter odd number= "+number);
				
	}  
	}

