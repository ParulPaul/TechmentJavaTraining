package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String args[]) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");  
	     EntityManager em=emf.createEntityManager();  
	        
	        
	        Student s=em.find(Student.class,1);  
	        
	        System.out.println("Student id = "+s.getStudentId());  
	        System.out.println("Student dept = "+s.getDept());  
	        System.out.println("Student name = "+s.getName());
	}
	
	
}
