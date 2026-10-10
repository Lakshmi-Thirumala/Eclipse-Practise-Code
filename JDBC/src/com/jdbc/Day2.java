package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Day2 {
	
	public static void main(String... args) throws ClassNotFoundException, SQLException {
		
		//register driver 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Gopi@1234";
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		//prepare sql query 
		
		String sqlUpdateQuery = "update students set marks = 100 where id = 1 ";
		String sqlDeleteQuery = "delete from  students where id = 4";
		//create statement
		
		Statement st = connection.createStatement();
		
		//execute statement
		
		st.executeUpdate(sqlUpdateQuery);
		st.executeUpdate(sqlDeleteQuery);
		
		//close resources
		connection.close();
		st.close();
		
	}

}
