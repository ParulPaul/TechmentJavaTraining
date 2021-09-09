package com.collectionAssisgnments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		double sum =0,average=0;
		StudentMarks s1 = new StudentMarks();
		
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the num of marks ");
		int number = scanner.nextInt();
		System.out.println("Marks are = "+number);

		ArrayList<Integer> marks=new ArrayList<Integer>(number);
		
		Scanner scanMarks = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.print("Enter the marks for student "+(i+1)+"= ");
			marks.add(scanMarks.nextInt()) ;
		}


		ArrayList<Integer> copyMarks   = (ArrayList<Integer>)marks.clone();

		
		Collections.sort(marks);
		
		
		
		System.out.println("Highest marks "+marks.get(number-1));
		
		for(int i=0;i<number;i++)
		{	
			 sum +=marks.get(i);
		}
		
		average= sum/number;
		
		System.out.println("average marks= "+average);
		
		System.out.print(" marks : ");
		for(int i=0;i<number;i++)
		{	

			 System.out.print("["+(i+1)+" - "+copyMarks.get(i)+"]");
		}

	
		System.out.println("3rd student marks "+copyMarks.get(2));
		
		System.out.print("Sorted marks : ");
		for(int i=0;i<number;i++)
		{	

			 System.out.print("["+(i+1)+" - "+marks.get(i)+"]");
		}

	}

}
