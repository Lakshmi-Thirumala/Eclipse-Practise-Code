package com.arrays;

import java.util.Scanner;

public class EvenArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		EvenArray evarr = new EvenArray();
		 evarr.evenArray(arr,size);
		
	}
	void  evenArray(int[] array,int size){
		int evencount =0 ;
		int oddcount=0;
		for(int i = 0 ; i< size;i++) {
			if(array[i] % 2 == 0 ) {
				evencount++;
			}
			else {
				oddcount++;
			}
				
		}
		System.out.println("even elements count " + evencount);
		System.out.println("odd elements count " + oddcount);
		
		
	}

}
