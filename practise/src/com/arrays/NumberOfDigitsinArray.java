package com.arrays;

import java.util.Scanner;

public class NumberOfDigitsinArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i =0 ;i<size ;i++) {
			arr[i] = sc.nextInt();
		}
		NumberOfDigitsinArray num = new  NumberOfDigitsinArray();
		num.numberOfDigitsMethod(arr,size);
	}
	void numberOfDigitsMethod(int[] arr ,int size){
		for(int i=0; i<size;i++) {
		int num = arr[i];
		int count = 0 ;
		while(num>0) {
			num = num/10;
			count++;
			}
		 System.out.println("Number of Digits  " + arr[i] + " = " + count );
		}
		}
		
		
		
}
