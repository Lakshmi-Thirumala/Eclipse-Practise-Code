package com.nestedforloop;

public class Practietwo {
	
	public static void main(String[] args) {
		int count = 0 ;
		for(int i =1;i<=100;i++) {
			if(!(i%2==0 && i%17 ==0 && i>50)) {
				continue;
			}
			count++;
			System.out.println(count);
			System.out.println("***************");
			System.out.println(i);
		}
		
	}

}
