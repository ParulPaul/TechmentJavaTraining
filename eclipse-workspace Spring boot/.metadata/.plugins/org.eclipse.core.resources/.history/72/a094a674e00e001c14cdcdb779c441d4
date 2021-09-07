package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
 
	@Autowired
	IProductDao iProductDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("this is my first spring boot project");
		
		Product product1= new Product("hp","laptops",45000);
		Product product2= new Product("oneplus","mobile",4000);
	
	  //  iProductDao.save(product1);
	  //  iProductDao.save(product2);
	    
	    
	    System.out.println("inserte....d");
	    /**
	     * 
	     * findAll
	     * **/
	    List<Product> product=iProductDao.findAll();
	    product.forEach(System.out::println);
	    
	    /***
	     * 
	     * findbyID
	     */
	    /*
	    	Optional< Product> products = iProductDao.findById(9);
	  		if( products.isPresent())
	  			System.out.println("Products" + product.get(0));
	  			else
	  			System.out.println("no value with given id");
	  		
	  		
	  	Product product3 = iProductDao.findById(11).get();
	  	System.out.println("Product "  +product3);
	  		**/
	  	/***
	  	 * count
	  	 */	
	  	
	  	long totalProducts = iProductDao.count();
	  	System.out.println("total ptoducts" + totalProducts);
		
	  	
	  	/**
	  	 * deleteById
	  	 * */
	  
	  	/** iProductDao.deleteById(9);
	  	    System.out.println("deleted...");
	  	*/
	  
	 
	  		// iProductDao.existsById(10));
	  	
		
	//  Product prod= iProductDao.findByName("mi");
	 // System.out.println("product by name " +prod);
	  
	  List<Product>productList=iProductDao.findByCategory("laptops");
	  System.out.println("product by category" +productList);
	  
	  
	  
	  
	  
	  
	  
	}
}
