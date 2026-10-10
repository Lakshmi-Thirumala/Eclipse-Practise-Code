package com.jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SignUp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UserName :");
		
		String userName = sc.nextLine();
		System.out.println("Enter you password:");
		String password = sc.nextLine();
		
		Statement st = DbConnection.createStatement();
		try {
			st.executeUpdate("insert into users(user_name,password) values('"+ userName +"','"+ password+ "') ");
			System.out.println("Signed up Successfully");

		}catch(SQLException ex) {
			System.out.println("User already exists!");
		}
		
		
	}
}
