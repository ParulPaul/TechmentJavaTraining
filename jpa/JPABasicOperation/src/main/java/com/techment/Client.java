package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select name from Product");
		@SuppressWarnings("unchecked")
		List<String> list =query.getResultList();  
		
        System.out.println("Product Name :"); 
        
        for(String s:list) {  
              
           System.out.println(s);  
		
	}
        
      
        
        em.close();  
        emf.close();   
	}
}
