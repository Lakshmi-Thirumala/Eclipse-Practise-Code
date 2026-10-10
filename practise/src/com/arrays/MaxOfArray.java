package com.arrays;

import java.util.Scanner;

public class MaxOfArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize]; 
		for(int i = 0 ; i< arraySize ; i++) {
			array[i] = sc.nextInt();
		}
		int max= array[0];
		for(int i=1;i<arraySize;i++) {
			if(max < array[i] ){
				max= array[i];
				}
		}
		System.out.println("max element is : " + max);
		
	}
	
	

}
