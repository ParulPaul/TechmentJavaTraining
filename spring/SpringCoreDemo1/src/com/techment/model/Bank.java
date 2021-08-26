package com.techment.model;

public class Bank {

	String name;
	String ifseCode;
	String branch;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIfseCode(String ifseCode) {
		this.ifseCode = ifseCode;
	}
/**	
	public void setBranch(String branch) {
		this.branch = branch;
	}
**/
	

	
	
	
	
	
	public void displayBankDetails() {
		
		System.out.println("name" +name);
		System.out.println("ifsecode" +ifseCode);
		System.out.println("branch" +branch);
		
	}
}
	