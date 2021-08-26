package com.techment.model;

public class Employee1 {

	
	private int id;  
	private String name;  
	private Address1 address;
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}  
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
	
}
