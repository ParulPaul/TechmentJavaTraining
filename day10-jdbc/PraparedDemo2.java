package com.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PraparedDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			try{
				
				//step 1  load the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Class is Found");
				
				//step 2 create the connection 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","root");
				System.out.println("Connected");
				
				//prepared statement
				PreparedStatement ps = con.prepareStatement("insert into employee1 values(?,?,?,?)");
				System.out.println("Enter the num of employees");
				int emp_num = sc.nextInt();
				for(int i=0;i<=emp_num;i++) {
					System.out.println("Enter emploee id");
					int emp_id =sc.nextInt();
					ps.setInt(1, emp_id);
					System.out.println("Enter emploee name");
					String emp_name =sc.nextLine();
					ps.setString(1, emp_name);
					System.out.println("Enter emploee salary");
					int emp_sal =sc.nextInt();
					ps.setInt(1, emp_sal);
					
					ps.execute();

					System.out.println("inserted");

				}
				
						
						
						
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
			

		}
	
}
