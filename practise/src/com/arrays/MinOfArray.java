package com.arrays;

import java.util.Scanner;

public class MinOfArray {
	 public static void main(String[] args) {
		 
		 MinOfArray minarr = new MinOfArray();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter array size : ");
		
		 int minArraySize = sc.nextInt();
		 int[] arr = new int[minArraySize];
		 for(int i =0 ; i < minArraySize ; i++) {
			 arr[i] =  sc.nextInt();
		 }
		 int minelement = minarr.minElementInArray(arr,minArraySize);
		 System.out.println("min element  : " + minelement);
	 		
		
	}
	  int minElementInArray(int[] arr, int size ) {
			 int min= arr[0];
			 for(int i =0 ; i < size ; i++) {
				 if(min>arr[i]) {
					 min= arr[i];
				 }
				
			 }
			 return min;
			 
				 
			 }
}
