package com.method;

import java.util.Scanner;

public class PractiseMethod {
	
	public static void main(String[] args) {
		
		System.out.println("Enter First String : ");
		Scanner sc = new Scanner(System.in);
		String nameOne = sc.nextLine() ;
		
		System.out.println("Enter Second String : ");
		String nameTwo = sc.nextLine();
		
		PractiseMethod mt = new PractiseMethod();
		String result = mt.concateMethod(nameOne, nameTwo);
		System.out.println(result);
		
		}
	
	   String concateMethod(String one, String two) {
		   
		  return one+two;
	   }

}
