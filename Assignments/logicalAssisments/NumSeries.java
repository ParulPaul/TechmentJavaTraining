package logicalAssisments;

import java.util.*;
public class NumSeries {
	
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in); 
		     int n,i=1;
		     System.out.println("Enter the nth term");
		     n=cs.nextInt();
		     while(i<=n)
		     {
		      System.out.print(i*i*i+" ");
		      i++;
		      }
		      cs.close();
		 }

}
