package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements IDao {

	public void databaseName() {
	
		System.out.println("Oracle is connected");
	}

}
