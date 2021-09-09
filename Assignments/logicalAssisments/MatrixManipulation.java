package logicalAssisments;

import java.util.Scanner;

public class MatrixManipulation {

	public static void matrixAddition(int arr[][][], int n){
		for(int i=0;i<n;i++)  {
			for(int j=0;j<n;j++)
				arr[i][j][2]=arr[i][j][0]+arr[i][j][1];
			}
		}


	public static void main(String[] args) {
	

		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter matrix size n");
		n=scanner.nextInt();
		
		int array[][][] = new int[n][n][3];
		
		System.out.println("Enter first matrix["+n+"]["+n+"]" +"in row ");
		
		for(int i=0;i<n;i++) {  
			for(int j=0;j<n;j++)
				array[i][j][0]=scanner.nextInt();
		}
		
		System.out.println("Enter second matrix["+n+"]["+n+"]" +"in row");
		
		for(int i=0;i<n;i++) {    
			for(int j=0;j<n;j++)
				array[i][j][1]=scanner.nextInt();
		}
		
		matrixAddition(array,n);
		
		System.out.println("Addition of matrix["+n+"]["+n+"]" +"is :");
		for(int i=0;i<n;i++)   
		{
			for(int j=0;j<n;j++)
				System.out.print(array[i][j][2] +" ");
			System.out.println();
		}

	}

}
