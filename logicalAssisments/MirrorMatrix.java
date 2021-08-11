package logicalAssisments;



import java.util.Scanner;



public class MirrorMatrix {

	public static void main(String[] args) {
		
		
			int n;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter matrix size ");
			n=scanner.nextInt();
			
			int array[][][] = new int[n][n][2];
			
			System.out.println("Enter matrix["+n+"]["+n+"]" +"in row ");
			
			for(int i=0;i<n;i++)
			{  
				for(int j=0;j<n;j++)
					array[i][j][0]=scanner.nextInt();
			}
			
			for(int i=n-1,k=0;i>=0;i--,k++) {
				for(int j=0; j<n;j++) {
					array[j][k][1]=array[j][i][0]; 
				}
			}
			
			System.out.println("Mirror matrix["+n+"]["+n+"]" +"is :");
			
			for(int i=0;i<n;i++)   
			{
				for(int j=0;j<n;j++)
					System.out.print(array[i][j][1] +" ");
				System.out.println();
			}

		

	}

}
