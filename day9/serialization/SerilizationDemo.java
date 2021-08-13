package com.day9.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee  implements Serializable{
	
	int id;
	transient String name;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

public class SerilizationDemo  {

	public static void main(String[] args) throws IOException {
		
		Employee emp = new Employee(1,"parul");
		
		System.out.println("===serialisation started===");
		FileOutputStream fis = new FileOutputStream("hello.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fis);
		
		oos.writeObject(emp);
		System.out.println("===serialisation completed===");
	}

}
