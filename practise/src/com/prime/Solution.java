package com.prime;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int number = 0;
		boolean bol = sol.isPrime(number);
		System.out.println(bol);
	}
	   
	    boolean isPrime(int number) {
	        // Your code here
	        int count=0;
	        for(int i=2;i< number/2;i++){
	        if( number%i==0){
	            count++;
	        }}
	        if(count==0){
	            return true; 
	        }
	        else {
	        	return false;
	        }
	    }
	}
