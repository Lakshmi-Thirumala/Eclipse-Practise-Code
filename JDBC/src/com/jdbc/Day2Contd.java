package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day2Contd {
	
	public static void main(String[] args) throws SQLException {
		
		
		//Establish a connection 
		
				String url = "jdbc:mysql://localhost:3306/jdbc";
				String userName = "root";
				String password = "Gopi@1234";
				
				System.out.println("Establishing connection");
				
				Connection connection = DriverManager.getConnection(url,userName,password);
				
				System.out.println("Connection Established");
				
				
				//prepare sql query
				String sqlSelectQuery = "select * from students";
				
				
				
				//create statement

				Statement st = connection.createStatement();
				
				//execute statement
				
				ResultSet rs = st.executeQuery(sqlSelectQuery);
				
//				while(rs.next()) {
//					int id = rs.getInt(1);
//					String name = rs.getString(2);
//					int marks = rs.getInt(3);
//					
//					System.out.print(id + " "+ name + "  "+ marks);
//					System.out.println("");
//				}
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int marks = rs.getInt("marks");
					
					System.out.print(id + " "+ name + "  "+ marks);
					System.out.println("");
				}
				
				System.out.println("Executed query ");
			
				
				
				

				
	}

}
