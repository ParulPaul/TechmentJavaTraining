package com.encapsulation;

class Employee
{
	 int id;
	 String name;
	 
	 public void setId(int id) {
		  
		 this.id=id;
	 }
	 
	 public int getId() {
		 return id;
	 }
	
	 public void setName(String name) {
		  
		 this.name=name;
	 }
	 
	 public String getName() {
		 return name;
	 }
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		 Employee emp = new Employee();
		 emp.setId(1);
		 System.out.println(emp.getId());
		 
		 emp.setName("Rahul");
		 System.out.println(emp.getName());
		
	}

}
