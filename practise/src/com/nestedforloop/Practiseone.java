package com.nestedforloop;

public class Practiseone {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
			continue;
			}
			count++;
		System.out.println(i);
		}
		System.out.println("##########");
		System.out.println(count);
	}

}
