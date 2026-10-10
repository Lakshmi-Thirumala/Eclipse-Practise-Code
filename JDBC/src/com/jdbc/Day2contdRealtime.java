package com.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class Day2contdRealtime {
	
	public static void main(String...strings) {
		
		Statement st = DbConnection.createStatement();
		try {
			st.executeUpdate(Dbproperties.INSERT_QUERY);
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
