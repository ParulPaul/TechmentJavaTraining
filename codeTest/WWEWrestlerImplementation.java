package com.techment.codeTest;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.techment.day12.newfeature.Employee;





class WWE

{
	private String firstName;
	private String lastName;
	private int weight;
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
	
	
	
}

public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		
		ArrayList<WWE> wwe1 = new ArrayList<WWE>();
		wwe1.add(new WWE("parul","paul",260));
		wwe1.add(new WWE("shephali","paul",240));
		wwe1.add(new WWE("aayushi","tiwari",120));
		wwe1.add(new WWE("manisha","chandra",126));
		wwe1.add(new WWE("vaishali","sahu",250));
		
		WWEWrestlerImplementation impl = new WWEWrestlerImplementation();
		System.out.println("============No of westlers=======================");
		impl.numofWWE(wwe1);
		System.out.println("============Minimum WWE=======================");
        System.out.println(impl.minWeightWWE(wwe1));
        System.out.println("============Sum of weights=======================");
        System.out.println(impl.sumofWeights(wwe1));
        System.out.println("============Print first names=======================");
		impl.printFirstName1(wwe1);
		

		
	}
	
	void numofWWE(ArrayList<WWE> wwe) 
	{
		 wwe.stream().forEach(System.out::println);
	}
	
	double sumofWeights(ArrayList<WWE> wwe)
	{
		
		double sum = wwe.stream().filter(p -> (p.getWeight() > 200)).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();;
			return sum;
			
		
		
	}
	
	
	int  minWeightWWE(ArrayList<WWE> wwe) 
	{
		int minWeight = wwe.stream().collect(Collectors.summarizingInt(WWE :: getWeight )).getMin();
		return minWeight;
	
	}
	
	public void printFirstName1(ArrayList<WWE> wwe) {
		wwe.stream().forEach(p -> System.out.println(p.getFirstName()));
	}
	
	
	
	
}

