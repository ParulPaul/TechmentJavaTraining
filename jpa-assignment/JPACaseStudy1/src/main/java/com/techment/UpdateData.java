package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = em.find(Author.class, 3);
		System.out.println("Name of author: "+author.getFirstName()+ " "+author.getMiddleName()+" "+author.getLastName());
		System.out.println("Mobile num: "+author.getPhoneNumber());
		
		author.setPhoneNumber(881711224);
		em.persist(author);
	
		System.out.println("Updated mobile num: "+author.getPhoneNumber());
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
