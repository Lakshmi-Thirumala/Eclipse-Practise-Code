package com.stringpractise;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		SumOfDigits rnb = new SumOfDigits();
		rnb.sumOfNumber(number);
	}
	
	void sumOfNumber(int Number) {
		int sum= 0 ;
		while(Number>0) {
			int lastDigit = Number%10;
			sum +=  lastDigit;
			Number= Number/10;	
		}
		System.out.println("sum of a number : "+ sum);
	}

}
