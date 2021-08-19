package com.techment.day13.newFeature;

@FunctionalInterface
interface A{
	
	Student getStudentDetails();
	
}

class Student{
	
	int id;
	String name;
	
	void display() {
		
		System.out.println("this is a student info");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		//by using lambda
		A a =()  -> {
			
			Student s =new Student();
			return s;

	};
	
	a.getStudentDetails().display();
	
	A a1= ()-> new Student();
	a1.getStudentDetails().display();
	
	//by using method reference
	
	A obj =Student::new;
	obj.getStudentDetails().display();
	

}
}