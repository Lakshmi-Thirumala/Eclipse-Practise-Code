package com.prime;

import java.util.Scanner;

public class PrimeOptimise {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0 ;
		
		for(int i=1 ; i<= num/2 ; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not prime Number");
		}
		
	}

}
