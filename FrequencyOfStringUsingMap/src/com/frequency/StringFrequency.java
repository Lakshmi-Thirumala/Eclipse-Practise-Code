package com.frequency;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency{
	
	public static void main(String... args) {
		
		String name = "ABBCCf";
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
//			if(map.get(c)== null) {
//				map.put(c, 1);
//				}
//			else {
//				Integer count = map.get(c);
//				map.put(c, count+1);
//				
//			}
			
			map.put(c,map.getOrDefault(c, 0)+1);
			
			
		}
		System.out.println(map);
		
	}

}