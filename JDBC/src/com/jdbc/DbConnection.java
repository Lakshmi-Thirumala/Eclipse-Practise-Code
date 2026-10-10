package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	
	public static Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Dbproperties.DB_URL, Dbproperties.DB_USERNAME, Dbproperties.DB_PASSWORD);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return connection;

	}
	
	
	public static Statement createStatement() {
		
		Connection createConnection = createConnection();
		Statement st = null;
		try {
		 st = createConnection.createStatement();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return  st;
		
	}

}
