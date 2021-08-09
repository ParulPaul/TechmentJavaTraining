package logicalAssisments;

import java.util.*;

public class Horse {

 public static void main(String args[])
	{
	int horse1, horse2,horse3;
		
	Scanner s = new Scanner(System.in);

  		System.out.print("Enter the weight of horse1:");
            horse1 = s.nextInt();

            System.out.print("Enter the weight of horse2:");
            horse2 = s.nextInt();

            System.out.print("Enter the weight of horse3:");
            horse3 = s.nextInt();

            if(horse1 > horse2 && horse1 > horse3)
   		      {
        	     System.out.println("Largest weight is:"+horse1);
            	}
         	else if (horse2 == horse3)
    	   {
            System.out.println("Entered weights are not distinct");
            }
             
}
}
