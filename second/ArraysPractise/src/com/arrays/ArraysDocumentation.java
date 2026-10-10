package com.arrays;

import java.util.Arrays;

public class ArraysDocumentation {
	
	public static void main(String...strings) {
		
//		//problem-1 -palindrome
//		
//		//Definition: An array is palindrome if it reads the same forward and backward.
//		int[] arr1 = new int[5];
//		arr1[0]=10;
//		arr1[1]=20;
//		arr1[2]=30;
//		arr1[3]=40;
//		arr1[4]=10;
//		
//		//way1 of printing array elements 
//		System.out.println(Arrays.toString(arr1));
//		
//		System.out.println("*************************");
//		
//		//way2 - for loop
//		
//	    for(int i=0;i<5;i++) {
//	    	System.out.println(arr1[i]);
//	    }
//	    
//	    boolean isPalindrome = true;
//	    
//	    //palindrome logic 
//	    for(int i=0 ;i<5/2;i++)
//	    	if(arr1[i] != arr1[5-1-i]) {
//	    		isPalindrome = false;
//	    		break;
//	    	}
//	    
//	      if(isPalindrome) {
//	      System.out.println("palindrome");
//	      }
//	      else {
//	    	  System.out.println("not a palindrome");
//	      }
//		
//				
//		
//	}	
	
//	//using string
//	String str = "dadmom";
//	boolean isPalindromeString = true;
//	for(int i =0 ;i<str.length();i++) {
//		if(str.charAt(i) != str.charAt(str.length()-i-1)) {
//			isPalindromeString = false;
//			break;	
//		}}
//	if(isPalindromeString) {
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println("not a palindrome");
//	}
//	}
		
		
//		//problem-3 Prime numbers in array → Print only prime numbers from an array.
//		
//		int[] arr2 = new int[5];
//		arr2[0]=21;
//		arr2[1]=22;
//		arr2[2]=23;
//		arr2[3]=0;
//		arr2[4]=29;
//		
//		int count = 0 ;
//		
//		for(int i = 0 ; i<5 ;i++) {
//			boolean isPrimeinArray = true;
//			if(arr2[i]<=1) {
//				isPrimeinArray = false;
//				
//			}
//			for(int j=2;j<= Math.sqrt(arr2[i]);j++) {
//				if(arr2[i]%j==0) {
//					isPrimeinArray = false;
//					break;	
//				}
//			}
//			if(isPrimeinArray)
//			{
//				System.out.println(arr2[i] + "is Prime");
//				count= count+1;		
//			}}
//			System.out.println("Number of prime Numbers :"+ count );
//		}
//	
		
//		//problem-4 sum of digits
//		
//		int[] arr3 = new int[] {20,25,30,35,40};
//		
//		   int totalSum =0;
//		
//			for(int j = 0 ; j<arr3.length ;j++) {
//				int num = arr3[j];
//			    int sum=0;
//			while(num>0) {
//			
//		  int  lastdigit = num%10 ;
//		  sum = sum + lastdigit;
//		 num= num/10;
//			}
//			totalSum+=sum;
//			
//		}
//		
//			System.out.println("Sum of array :"+ totalSum);
//		//System.out.println(Arrays.toString(arr3));
		
//		//problem-5 reverse of digits 
//		
//		int[] arr4 = new int[] {10,20,30,40,50};
//		for(int i =0 ;i<5;i++) {
//			int num = arr4[i];
//			int rev = 0;
//			while(num>0) {
//				int lastDigit =num%10 ;
//				rev = rev *10 + lastDigit;
//				num = num/10;
//				
//			}
//			System.out.println(rev);
//		}
		
//		//problem-6 reverse array
//		
//		int[] arr5 = new int[5];
//		arr5[0]=10;
//		arr5[1]=15;
//		arr5[2]=20;
//		arr5[3]=25;
//		arr5[4]=30;
//		
//		int start = 0;
//		int end = arr5.length-1;
//		
//		while(start<end) {
//			int temp = arr5[start];
//			arr5[start]= arr5[end];
//			arr5[end]=temp;
//			start++;
//			end--;
//			
//			
//		}
//		System.out.println(Arrays.toString(arr5));
//		
//		
//		
//		
//}
		
//		//problem -7 --max element 
//		
//		int[] arr6 = new int[] {10,20,40,45,30};
//		int max = arr6[0];
//		
//		for(int i = 0 ;i<arr6.length;i++)	{
//			if(max<arr6[i]) {
//				max= arr6[i];
//			}
//			
//		}
//		System.out.println(max);
//		
//		
//		
//	
//}
		
		//problem -amstrong
		int[] arr7 = new int[] {10,20,40,45,30,153};
		for(int i = 0 ;i<arr7.length;i++) {
			int originalnum = arr7[i];
			int num=originalnum ;   
			int count = String.valueOf(originalnum).length();
			int sum = 0;
			while(originalnum>0) {
				int digit =  originalnum%10;
				sum+=Math.pow(digit, count);
				originalnum = originalnum/10;
			}
			
			if(sum==num) {
				System.out.println("Amstrong");
				}
			else {
				System.out.println("not amstrong");
			}
		}
		
//		Second largest element → extends max logic.
//
//		Second smallest element → extends min logic.
//
//		Sorted array check → prepares you for sequence problems.
//
//		Frequency of elements → introduces counting logic.
//
//		Duplicate elements → teaches detection of missing/extra values.
		
	
	}
}


