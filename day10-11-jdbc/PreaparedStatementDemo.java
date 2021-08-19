package com.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreaparedStatementDemo {

	public static void main(String[] args) {
		try{
			
			//step 1  load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class is Found");
			
			//step 2 create the connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","root");
			System.out.println("Connected");
			
			//prepared statement
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
					ps.setInt(1,90);
					ps.setString(2,"rahul");
					ps.setInt(3, 24000);
					
					ps.execute();

					System.out.println("inserted");

		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		

	}

	

}
