package com.stringpractise;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int number = sc.nextInt();
		NumberOfDigits nbr= new NumberOfDigits();
		nbr.countOfDigits(number);
	}
	
	void countOfDigits(int number){
		int count=0;
		while(number>0) {
			number=number/10;
			count++;
			
		}
		System.out.println("Number of Digits :"+ count);
	}

}
