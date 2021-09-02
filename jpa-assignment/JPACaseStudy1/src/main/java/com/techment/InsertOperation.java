package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertOperation {

	

		public static void main(String[] args) {
			
			
			 EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");  
		     EntityManager em=emf.createEntityManager(); 
		     em.getTransaction().begin( );  
		     
		    
		
				
				Author author1 = new Author(1, "shephali", "paul", 27646446);
		        Author author2 = new Author(2, "sonal", "nety", 2345678);
		        
		        Author author3 = new Author(3, "parul", "paul", 909887777);
		        em.persist(author2);
		        em.persist(author1);
			       
		        em.persist(author3);
				
				
			
			
				
				em.getTransaction().commit();
				em.close();
				emf.close();
			}

		
	

}
