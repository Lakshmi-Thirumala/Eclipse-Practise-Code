package com.stringpractise;

import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		ReverseOfNumber rnb = new ReverseOfNumber();
		rnb.reverseNumber(number);
	}
	
	void reverseNumber(int Number) {
		int rev= 0 ;
		while(Number>0) {
			int lastDigit = Number%10;
			rev=(rev*10) + lastDigit;
			Number= Number/10;	
		}
		System.out.println("Reverse of a number : "+ rev);
	}

}
