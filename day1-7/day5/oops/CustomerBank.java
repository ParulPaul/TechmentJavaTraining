package com.day5.oops;


class Customer
{
	int custId;
	String custName;
	Account account;
	
	public Customer(int custId, String custName,  Account account) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.account = account;
	}
    
	void displayCustomerInfo()
    {
    	
    	System.out.println("Customer Id: "+custId);
    	System.out.println("Customer Name: "+custName);
    	System.out.println("Account Number: "+account.accNo);
    	System.out.println("Account Type: "+account.accType);
    	
    	System.out.println("IFSC Code: "+account.ifscCode);
    	System.out.println("Branch: "+account.branch);
    }
	
}
class Account
{
	long accNo;
	String accType;
	String ifscCode;
	String branch;
	
	
	public Account(long accNo, String accType, String ifscCode, String branch) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}
}

public class CustomerBank {

	public static void main(String[] args) {
		
		
			Account acc= new Account(9974359711455025l,"Saving", "SBIN0000", "4th Stage");
			Customer customer= new Customer(1010,"Parul",acc);
			customer.displayCustomerInfo();
		
}
}
