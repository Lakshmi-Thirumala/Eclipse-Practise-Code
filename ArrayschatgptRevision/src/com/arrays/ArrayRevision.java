package com.arrays;

import java.util.Arrays;

public class ArrayRevision {
	
	public static void main(String args[]) {
		
		int[] arr = new int[5];
		
		arr[0]= 10;
		arr[1]=15;
		arr[2]=25;
		arr[3]=121;
		arr[4]=1221;
		
		ArrayRevision obj = new ArrayRevision();
		
		int largest = obj.largestElement(arr);
		System.out.println("largest element = "+ largest);
		
		System.out.println("------------------------------------------");
		
		int smallest = obj.smallestElement(arr);
		System.out.println("smallest element = " + smallest);
		
		System.out.println("------------------------------------------");
		
		int secondLargest = obj.secondLargestElement(arr);
		System.out.println("Second Largest = " + secondLargest);
		
		System.out.println("------------------------------------------");
		
		int secondSmallest = obj.smallestSecondElement(arr);
		System.out.println("Second Smallest = " + secondSmallest );
		
		System.out.println("------------------------------------------");
		int sumOfElements = obj.sumOfArrayElements(arr);
		System.out.println("Sum OF Array = " +sumOfElements);
		
		System.out.println("------------------------------------------");
		double  averageOfElements = obj.averageOfArray(arr);
		System.out.println("Average OF Array = " +averageOfElements);
		
		System.out.println("------------------------------------------");
		int count  = obj.countOfEvenNumbers(arr);
		System.out.println("count OF even Numbers = " +count);
		
		System.out.println("------------------------------------------");
		int oddcount  = obj.countOddNumber(arr);
		System.out.println("count OF odd Numbers = " +oddcount);
		
		System.out.println("------------------------------------------");
		int[] Number  = obj.findMinandMax(arr);
		System.out.println("smallest Number = " +Number[0]);
		System.out.println("largest Number = " +Number[1]);
		
//		System.out.println("------------------------------------------");
//		 obj.reverseOfArray(arr);
		 
		 System.out.println("------------------------------------------");
		 obj.DuplicateElements(arr);
		 
		 System.out.println("------------------------------------------");
		 int searchIndex  = obj.searchGivenElement(arr,20);
		 System.out.println("Given element at index = "+ searchIndex);
		 
		 System.out.println("------------------------------------------");
		 int frequencyCount  = obj.frequencyOfGivenElement(arr,10);
		 System.out.println("Given frequency of an element = "+ frequencyCount);
		 
		 System.out.println("------------------------------------------");
		 boolean isSort = obj.isSorted(arr);
		 System.out.println(isSort);
		 
//		 System.out.println("------------------------------------------");
//		 int missingNumber = obj.findMissingNumber(arr);
//		 System.out.println(missingNumber);
		 
		 System.out.println("------------------------------------------");
		 int firstDuplicate = obj.firstDuplicateEleinArray(arr);
		 System.out.println(firstDuplicate);
		 
		 System.out.println("------------------------------------------");
		 obj.moveZeroesToEnd(arr);
		 
		 System.out.println("------------------------------------------");
		 int firstNonrepeated = obj.firstNonRepeatedElement(arr);
		 System.out.println(firstNonrepeated);
		 
		 System.out.println("------------------------------------------");
		 boolean isPalindrome = obj.isPalindrome(arr);
		 System.out.println(isPalindrome);
		 
		 System.out.println("------------------------------------------");
		 int isPalindromeinArray = obj.isPalindromeinArray(arr);
		 System.out.println(isPalindromeinArray);
		 
		 System.out.println("------------------------------------------");
		 obj.isPalindromeinArrayAll(arr);
		 
		 
		 System.out.println("------------------------------------------");
		 boolean isPalindromeNumber = obj.isPalindrome(1221);
		 System.out.println(isPalindromeNumber);
		 
		 System.out.println("------------------------------------------");
		 boolean isPrimeNumber = obj.isPrime(1);
		 System.out.println(isPrimeNumber);
		 
		 System.out.println("------------------------------------------");
		 boolean isAmstrongNumber = obj.isAmstrong(153);
		 System.out.println(isAmstrongNumber);
		 
		 System.out.println("------------------------------------------");
		 int factorial = obj.factorial(5);
		 System.out.println(factorial);
		 
		 System.out.println("------------------------------------------");
		 int factorialRecursive = obj.factorialRecursive(5);
		 System.out.println(factorialRecursive);
		 
		 System.out.println("------------------------------------------");
		 obj.fibannociSeries(2);
		 
		 System.out.println("------------------------------------------");
		 int reverseNumber = obj.reverseOfNumber(123);
		 System.out.println(reverseNumber);
		 

		 System.out.println("------------------------------------------");
		 int sum = obj.sumOfDigits(123);
		 System.out.println(sum);
		 
		 System.out.println("------------------------------------------");
		 int countOfDigits = obj.countdigits(123);
		 System.out.println(countOfDigits);
		 	 
		 	
	}
		
		
	
	//largest 
	public int largestElement (int[] arr) {
		int largest = arr[0];
		for(int i =1 ;i< arr.length ;i++) {
			if(arr[i] > largest) {
				largest = arr[i];	
			}
			
		}
		
	return largest;
		
	}
	
	public int smallestElement(int[] arr) {
		
		int smallest = arr[0];
		for(int i = 1 ;i < arr.length ;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
		
	}
	
	
	public int secondLargestElement(int[] arr) {
		
		 int largest = arr[0];
		 int secondLargest = Integer.MIN_VALUE;
		for(int i = 1;i< arr.length ; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]> secondLargest) {
				secondLargest = arr[i];
			}
		 }
				 
		
		return secondLargest;
		
	}
	
	public int smallestSecondElement(int[] arr) {
		int secondSmallest =Integer.MAX_VALUE;
		int smallest=arr[0];
		for(int i = 1 ;i < arr.length;i++) {
		if(smallest > arr[i]) {  
			secondSmallest = smallest; 
			smallest = arr[i];
		}
		else if (arr[i] < secondSmallest){
			secondSmallest = arr[i];
		}
		}
		return secondSmallest;
		
		
	}
	
	public int sumOfArrayElements(int[] arr) {
		
		int sum = 0 ;
		for(int i =0 ;i < arr.length ;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
	public double averageOfArray(int[] arr) {
		double average = 0.0 ;
		int sum = 0;
		for(int i = 0 ;i < arr.length ;i++) {
			sum+=arr[i];	
		}
		 return average = (double)sum/arr.length ;
		
	}
	
	public int countOfEvenNumbers(int[] arr) {
		
		int count = 0 ;
		for(int i = 0 ; i< arr.length ; i++ ) {
			if(arr[i] % 2 == 0) {
				count ++;
			}
		}
		return count;
		
		
	}
	
	public int countOddNumber(int[] arr) {
		int count = 0;
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]%2 !=0) {
				count++;
			}
		}
		return count;
	}
	
	public  int[] findMinandMax(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0 ;i< arr.length ;i++ ) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			if(arr[i]< smallest) {
				smallest = arr[i];
			}
			
		}
		return new int[] {smallest,largest}; 
	}
	
	 public void reverseOfArray(int[] arr) {
		 
		 for (int i = 0 ;i<arr.length/2 ;i++) {
			 int temp = arr[i];
			 arr[i]= arr[arr.length-1-i];
			 arr[arr.length-1-i]= temp;
		 }
		 System.out.println(Arrays.toString(arr));
		
	 }
	 
	 
	 public void DuplicateElements(int[] arr) {
		 for(int i = 0 ;i< arr.length;i++) {
			 for(int j=i+1 ;j <arr.length ;j++) {
				 if(arr[i] == arr[j]) {
				  System.out.print(arr[i] + " "); 
				 }
			 }
		 }
		 System.out.println("");
	 }
	 
	 public int searchGivenElement(int[] arr ,int tar̥get) {
		 for(int i = 0 ;i <arr.length ;i++) {
			 if(arr[i]== tar̥get) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 public int frequencyOfGivenElement(int[] arr ,int target) {
		 int count = 0;
		 for(int i = 0 ;i< arr.length ;i++) {
			 if(arr[i]==target) {
				 count++;
			 }
		 }
		 return count;
	 }
	 
	 public boolean isSorted(int[] arr) {
		 for(int i = 0 ;i<arr.length-1 ;i++) {
			 if(arr[i]> arr[i+1]) {
				 return false;
				
			 }
		 }
		 return true;
	 }
	 
	 public int findMissingNumber(int[] arr) {
		 int valueSum=0;
		 int n = arr.length+1;
		 int indexSum = (n * (n+1)) /2;
		 for(int i = 0 ;i <arr.length ;i++) {
			 valueSum+=arr[i];
		 }
		 return indexSum-valueSum;
		 	
	 }
	 
	 public int firstDuplicateEleinArray(int[] arr) {
		 for(int i = 0 ;i <arr.length ;i++) {
			 for(int j = i+1 ;j< arr.length ;j++) {
				 if(arr[i]== arr[j]) {
					 return arr[i];
				 }
			 }
		 }
		 return -1;
	 }
	 
	 public void moveZeroesToEnd(int[] arr) {
		 int index=0;
		 for(int i= 0;i<arr.length;i++) {//10 0 0 20 20
			 if(arr[i]!=0) 
			 {
				arr[index]=  arr[i];
				index++;
			 }
		 }
		 for(int i = index ;i < arr.length ;i++) {
			 arr[i]= 0;
		 }
		 System.out.println(Arrays.toString(arr));
	 }
	 
	 public int firstNonRepeatedElement(int[] arr) {
		 for(int i=0 ; i< arr.length ; i++) {
			 int count = 0;
			 for(int j =0 ;j< arr.length ;j++) {
				 if(arr[i]== arr[j]) {
					count ++; 
				 }
			 }
			 if(count == 1) {
				 return arr[i];
			 }
		 }
		 return -1;
	 }
	 
	 public boolean isPalindrome(int[] arr) {
		 for(int i = 0 ;i < arr.length ;i++) {
			 int rev = 0 ;
			 int temp = arr[i];
			while(temp != 0) {
				int lastDigit = temp%10;
				 rev = rev *10 +lastDigit;
				 temp = temp/10;			
			}
			if(rev== arr[i]) {
				return true;
			}
		 }
		 return false;
	 }
	 
	 public int isPalindromeinArray(int[] arr) {
		 for(int i = 0 ;i < arr.length ;i++) {
			 int rev = 0 ;
			 int temp = arr[i];
			while(temp != 0) {
				int lastDigit = temp%10;
				 rev = rev *10 +lastDigit;
				 temp = temp/10;			
			}
			if(rev== arr[i]) {
				return arr[i];
			}
		 }
		 return -1;
	 }
	 
	 public void isPalindromeinArrayAll(int[] arr) {
		 for(int i = 0 ;i < arr.length ;i++) {
			 int rev = 0 ;
			 int temp = arr[i];
			while(temp != 0) {
				int lastDigit = temp%10;
				 rev = rev *10 +lastDigit;
				 temp = temp/10;			
			}
			if(rev== arr[i]) {
				System.out.println(arr[i]);
			}
		 }
	 }
	 
	 public boolean isPalindrome(int num) {
		 int temp = num;
		 int rev = 0 ;
		 while(temp !=0) {
			int lastDigit = temp%10;
			rev = rev*10 + lastDigit;
			temp = temp/10;	
		 }
		return rev==num;
	 }
	 
	 
	 public boolean isPrime(int num) {
		 if(num<2) {
			 return false;
		 }
		 for(int i = 2 ;i <= Math.sqrt(num); i++) {
			 if(num%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public boolean isAmstrong(int num) {
		 int temp1 = num;
		 int temp2 = num;
		 int count=0;
		 double sum=0;
		while(temp1!=0) {
			temp1= temp1/10;
			count++;
		}
		while(temp2!=0) {
			int digit = temp2%10;
			sum = sum+ Math.pow(digit, count);
			temp2= temp2/10;
			
		}
		if(sum== num) {
			return true;
		}
		return false;
	 }
	 
	 public int factorial(int num) {
		 int result = 1 ;
		 if(num== 0 || num ==1) {
			 return 1;
		 }
		for(int i = num ;i >= 1 ;i--) {
			result =  result * i;
		}
		return result;
	 }
	 
	 
	 public int factorialRecursive(int num) {
		 if(num== 0 || num ==1) {
			 return 1;
		 }
		return num* factorialRecursive(num-1) ;
	 }
	 
	 public void fibannociSeries(int num) {
		 int a = 0;
		 int b = 1;
		 
		 if(num<=0) {
			 return;
		 }
		 System.out.print(a + " ");
		 if(num==1) {
			 return;
		 }
		 System.out.print(b + " ");
		 for(int i = 3 ;i <=num ;i++) {
			int next =  a+b;
			System.out.print(next + " ");
			a= b;
			b=next;
		 }
		 System.out.println("");
		 
	 }
	 
	 public int reverseOfNumber(int num) {
		 int rev=0 ;
		 int temp = num;
			while(temp!=0) {
				int digit = temp%10;
				rev = rev*10 + digit;
				temp= temp/10;
			}
		 return rev;
	 }
	 
	 public int sumOfDigits(int num) {
		 
		 int sum=0 ;
		 int temp = num;
			while(temp!=0) {
				int digit = temp%10;
                sum = sum + digit;
				temp= temp/10;
			}
		 return sum;
		 
	 }
	 
	 public int countdigits(int num) {
		 int count = 0;
		 while(num!=0) {
			 num= num/10;
			 count++;
		 }
		 return count;
	 }
	 
	 


}
