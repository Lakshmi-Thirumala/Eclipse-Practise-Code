package com.arrays;

import java.util.Scanner;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		ArrayReverse arrev = new ArrayReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0 ; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int[] rev = arrev.approachOne(arr,size);
		for(int i=0 ; i<size;i++)
		System.out.print(rev[i] + " ");
		
	}
	
	int[] approachOne(int[] arr,int size){
		int[] rev = new int[size];
		for(int i=0 ; i<size ; i++) {
			rev[i]= arr[size-i-1];
		}
		return rev;
	}
	
	

}
