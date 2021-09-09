package logicalAssisments;
import java.lang.Math;

public class RandomNum {
	public static void main(String args[])   
	{   
		double num1=Math.random();
		double num2=Math.random();

	System.out.println("1st Random Number: " + num1);   
	System.out.println("2nd Random Number: " + num2);  
	if(num1==num2)
		System.out.println("Equal");
	else
		System.out.println("Not Equal");

	
	}
}
