package com.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnectionDemo {
	
	public static void main(String rags[]) {
		
		
				//A o = new A();
				try{
					//Class.forName("com.techment.day10.jdbc");
					
					//step 1  load the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Class is Found");
					
					//step 2 create the connection (collection is a interface)
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","root");
					
					System.out.println("Connected");
					
					
					// step 3 create statment 
					Statement stmt = con.createStatement();
				//	stmt.execute("insert into employee values(1,'sachin',34000);");
				//	System.out.println("inserted");
					
					ResultSet rs =  stmt.executeQuery("select * from employee");
					 
					while(rs.next())
					{
						
						System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getInt(3));
					}
					

				}
				
				catch (Exception e)
				{
					System.out.println(e);
				//	e.printStackTrace();
				}
				

			}

}
