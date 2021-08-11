package HandsOnProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks to be entered ");
		int num= sc.nextInt();
		int marks[];
		marks = new int[num];
		for(int i=0; i<marks.length;i++)
		{
			System.out.println("Enter "+(i+1)+" marks: ");
			marks[i]= sc.nextInt();
		}
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("marks "+(i+1)+" :"+marks[i]);
		}
		int sum = 0;  
        for (int i = 0; i < marks.length; i++) 
        {  
           sum = sum + marks[i];  
        }  
        System.out.println("Total of all the marks is: " + sum);
        
       
        
        Arrays.sort(marks); 
        
        System.out.println("Highest marks: "+marks[marks.length-1]);
        
        System.out.println("Lowest marks: "+marks[0]);
        
      
        
        int counter=0;
        for(int i=0; i<num; i++)
        {
        	if(marks[i]>40)
        	{
        		counter++;
        	}
        	else
        		System.out.println("Student failed");
        }
        if(counter==num);
        System.out.println("Student passed");

    }
	
}
