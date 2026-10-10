package com.forloopeffective;

import java.util.Scanner;

public class ForLoopEffective {
	
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		ForLoopEffective ef = new ForLoopEffective();
		ef.primeCheckOne(num,count);
		ef.primeCheckTwo(num,count);
		ef.primeCheckThree(num, count);
		ef.primeCheckFour(num, count);
		ef.primeCheckFive(num,count);
		ef.primeCheckSix(num, count);
	}
	
	void primeCheckOne(Long num,int count){
		
		Long  start = time();
		for(int i = 1 ; i<=num ; i++) {
			if(num%i == 0) {
				count ++;
			}
		}
		if(count==2) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		Long end = time();
		System.out.println(end-start);
		
		
	}
	
	void primeCheckTwo(Long num,int count) {
		Long  start = time();
		for(int i=2 ;i<=num ; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		Long end = time();
		System.out.println(end-start);
		
	}
	
	void primeCheckThree(Long num,int count) {
		Long  start = time();
		for(int i=2 ;i<num;i++) {
			
			if(num%i==0) {
				 count++;
			}
			
		}
		if(count==0) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		Long end = time();
		System.out.println(end-start);
	}
	
	void primeCheckFour(Long num,int count) {
		Long  start = time();
		for(int i =2 ;i<num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		Long end = time();
		System.out.println(end-start);
	}
	
	void primeCheckFive(Long num,int count) {
		Long  start = time();
		for(int i = 2 ;i <= Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		Long end = time();
		System.out.println(end-start);
	}
	
	void primeCheckSix(Long num,int count) {
		Long  start = time();
		if(num%2==0) {
			count++;
		}
		else {
			for(int i =2 ; i <= Math.sqrt(num);i++) {
				if(num%i==0) {
					count++;
				}
			}
		}
		if(count==0) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime");
		}
		Long end = time();
		System.out.println(end-start);
		
	}
	
	 Long time() {
		return System.currentTimeMillis();
	}
	 
	 

}
