package com.stringpractise;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		Palindrom rnb = new Palindrom();
		rnb.reverseNumber(number);
	}
	
	void reverseNumber(int Number) {
		int rev= 0 ;
		int temp = Number;
		while(Number>0) {
			int lastDigit = Number%10;
			rev=(rev*10) + lastDigit;
			Number= Number/10;	
		}
		if(rev==temp) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}

}
}
