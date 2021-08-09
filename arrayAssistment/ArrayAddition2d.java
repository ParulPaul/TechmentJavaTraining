package com.arrayAssistment;

public class ArrayAddition2d {

	public static void main(String[] args) {
		
		int rows = 2, columns = 3;
        int[][] firstMatrix = { {0, 1, 3}, {4, 2, 5} };
        int[][] secondMatrix = { {1,2, 3}, {5, 60, 0} };

       
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of the given matrices is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
	
