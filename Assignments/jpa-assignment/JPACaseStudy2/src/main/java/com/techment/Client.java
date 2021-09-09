package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = new Author();
		author.setId(101);
		author.setName("Parul");
		
		em.persist(author);
		
		Book book1 = new Book();
		book1.setIsbn(10001);
		book1.setTitle("Java");
		book1.setPrice(100);
		book1.setAuthor(author);
		
		Book book2 = new Book();
		book2.setIsbn(10002);
		book2.setTitle("C");
		book2.setPrice(150);
		book2.setAuthor(author);
		
		em.persist(book1);
		em.persist(book2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}