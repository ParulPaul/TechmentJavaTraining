package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Product;


@Repository
public interface IProductDao extends JpaRepository<Product,Integer>{

	Product findByName(String name);
	List<Product>findByCategory(String category);
	List<Product>findByNameAndCategory(String category, String name);
	
	
	
}

