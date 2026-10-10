package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Day1 {
	
	public static void main(String...strings) throws ClassNotFoundException, SQLException {
		
		//Register Driver 
		System.out.println("Started Registering  driver");
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //fully qualified name package plus classname
		
		System.out.println("Driver registered");
		
		//Establish a connection 
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Gopi@1234";
		
		System.out.println("Establishing connection");
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		System.out.println("Connection Established");
		
		
		//prepare sql query
		String sqlInsertQuery = "insert into students values (1,'Lakshmi',90)";
		
		
		//create statement 
		
		Statement st = connection.createStatement();
		
		// execute statement
		
		st.executeUpdate(sqlInsertQuery);
		
		System.out.println("Inserted Data");
		
		//close the resources 
		
		connection.close();
		st.close();
	}
	
	

}
