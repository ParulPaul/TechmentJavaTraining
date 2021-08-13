package com.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDetails {
	
	public static Connection getConnected() throws Exception {
		
		Class.forName(ConnectionProperty.DRIVER_NAME);
		Connection con =DriverManager.getConnection(ConnectionProperty.URL, ConnectionProperty.USERNAME, ConnectionProperty.PASSWORD);
		System.out.println("Successfully connected..");
		
		
		return con;
	}

}
