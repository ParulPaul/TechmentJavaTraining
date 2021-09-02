package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteOperation {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = new Author(4, "Rashmi", "Lall", 909765478);
		em.persist(author);
		
		author = em.find(Author.class, 4);
		em.remove(author);
		System.out.println("Author removed.");
		System.out.println("Name: "+author.getFirstName()+" "+author.getMiddleName()+" "+author.getLastName());
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
