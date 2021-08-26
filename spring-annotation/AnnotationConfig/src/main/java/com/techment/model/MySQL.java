package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class MySQL implements IDao {


	public void databaseName() {
		
		System.out.println("Oracle is connected");
	}
	
	
}
