package com.ternary;

import java.util.Scanner;

public class TernaryOperator {
	
	public static void main (String args[]) {
		
//		int a = 70 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		
		int a = sc.nextInt();
		
//		String grade =  a<=100 && a>=90 ? "A" : a<90 && a>=80 ? "B": a<80 && a>=70 ? "C" : a<70 && a >= 80  ? "D" : a<=70 && a>=0 ?  "Failed" : "Invalid Marks" ;
//		System.out.println(grade);
		
		for(int i= 1;i<=a;i++) {
			System.out.println(a + "*" + i + "=" + (a*i));
		}
	}

}
