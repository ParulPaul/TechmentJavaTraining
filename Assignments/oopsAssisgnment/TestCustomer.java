package oopsAssignment1;



class Address {
    private String addressLine;
    private String city;
  
    String getaddressLine()
	  {
		  return addressLine;
	  }
	  public void setaddressLine(String addressLine )
	  {
		  this.addressLine=addressLine;
	  }
	  public String getcity()
	  {
		  return city;
	  }
	  public void setcity(String city)
	  {
		  this.city=city;
	  }
   

	 Address(String addressLine,String city)
  {
	     setaddressLine(addressLine);
	     setcity(city);
  }

	 public String getAddressDetails()
 {	
	 String fulladdress;
	 fulladdress=getaddressLine()+',' +getcity();
	 return(fulladdress);
	 
 }
}
class Customer
  {
	 private String customerName;
	 private Address residentialAddress;
	 private Address officialAddress;
  
	 public String getcustomerName()
	  {
	  return customerName;
	  }
	 public void setcustomerName(String customerName )
	 {
	  this.customerName=customerName;
	 }
	 public Address getresidentialAddress()
	 {
	  return residentialAddress;
	 }

	 public void setresidentialAddress(Address residentialAddress)

	 {
		 
	  this.residentialAddress=residentialAddress;

	 }

	 public Address getofficialAddress() 
	  {
	
		 return officialAddress;
    }

	 public void setofficialAddress(Address officialAddress)
	  {
	this.officialAddress = officialAddress;
	
     }

	 Customer()
	 {
	    setcustomerName(null);
	    setresidentialAddress(null);
	    setofficialAddress(null);
	 }
	 
	 Customer(String customerName,Address residentialAddress,Address officialAddress)
	 {
	    setcustomerName(customerName);
	    setresidentialAddress(residentialAddress);
	    setofficialAddress(officialAddress);
	 }
	 public String getCustomerDetails()
	 {
	 	String CustomerDetails;
	 	CustomerDetails="Customer : "+getcustomerName()+"\n"+"Residential Address : "+residentialAddress.getAddressDetails()
	 	    +"\n"+"Official Address : "+officialAddress.getAddressDetails();
	 	    return(CustomerDetails);
	 	 }
	 }

public class TestCustomer {

	public static void main(String[] args) {
		
		
		Address addr = new Address("Street1" , "Banaglore");	
		Address addr1 = new Address("Street2" , "BangloreEast");	
		Customer customer=new Customer();
		customer.setcustomerName("John");
		customer.setresidentialAddress(addr);
		customer.setofficialAddress(addr1);
		
		System.out.println(customer.getCustomerDetails());
	}
}
