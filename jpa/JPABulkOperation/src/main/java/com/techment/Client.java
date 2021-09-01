package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {
		
	EntityManagerFactory emf = new Persistence().createEntityManagerFactory("s");
	EntityManager em = emf.createEntityManager();
	
	 Query query = em.createQuery( "Select s from Product s ");  
     
     @SuppressWarnings("unchecked")  
   List<Product> list=(List<Product>)query.getResultList( );  
      
     System.out.print("product_name");  
     System.out.print("\tproduct_price");  
    System.out.println("\t product_category");  
       
       
     for( Product s:list ){  
        System.out.print( s.getName());  
        System.out.print("\t" +  s.getPrice());  
       System.out.print("\t" + s.getCategory());  
       System.out.println();  
     }  
   
     
     Query query1 = em.createQuery( "update Product SET name=earphone where id=1");  
     query1.executeUpdate();  
     
     Query query2 = em.createQuery( "delete from Product where id=4");  
     query.executeUpdate();  

     em.getTransaction().commit();  
     em.close();  
     emf.close();    
}  
	

}
