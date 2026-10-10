package com.stringpractise;

import java.util.Scanner;

public class StringPractise {
	
	public static void main(String[] args) {
		
		System.out.println("enter name : ");
		Scanner sc = new Scanner(System.in) ;
		String name = sc.nextLine();
		for(int i=0;i< name.length();i++) {
			System.out.println(name.charAt(i) +  "-" + i);
		}
	}

}
