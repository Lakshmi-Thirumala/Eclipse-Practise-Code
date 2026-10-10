package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UserName :");
		
		String userName = sc.nextLine();
		System.out.println("Enter you password:");
		String password = sc.nextLine();
		
		Statement st = DbConnection.createStatement();
		try {
			ResultSet rs =  st.executeQuery("select * from users where  user_name =  '"+ userName + "'  and  password = '"+ password + "'");
			if(rs.next()) {
				System.out.println("Logged in ....");
			}
			else {
				System.out.println("Invalid credentials");
			}

		}catch(SQLException ex) {
			System.out.println("User already exists!");
		}

	}
}
