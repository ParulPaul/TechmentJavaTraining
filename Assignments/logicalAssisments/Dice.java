package logicalAssisments;

public class Dice {

	public static void main(String[] args) {
		double a=Math.random();
	
		double b=Math.random();

	System.out.println("1st Random Number: " + a);   
	System.out.println("2nd Random Number: " + b);  
	
	if(a%2==0 && b%2==0)
		System.out.println("Sum: "+(a+b));
	else
		System.out.println("Difference: "+(a-b));

	
	}
	

}
