package com.strings;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem {
	
	public static void main(String...strings) {
		
//		//String Problem 1 //Reverse the String and print the result.
//		String str = "hello";
//		String revString =  "";
//		
//		for(int i=str.length()-1 ;i>=0 ;i--) {
//			revString+=str.charAt(i);	
//		}
//		System.out.println(revString);
//		
//		//using streams
//		//String str = "hello";
//
//		String reversed = IntStream.range(0, str.length())
//		    .mapToObj(i -> str.charAt(str.length() - 1 - i))
//		    .map(String::valueOf)
//		    .collect(Collectors.joining());
//
//		System.out.println(reversed);
//	}
	
//	//problem2
//	
//	String str2 = "programming";
//	int count = 0;
//	
//	for(int i = 0 ;i<=str2.length()-1;i++) {
//		if( str2.charAt(i) == 'a' || str2.charAt(i) == 'e' ||str2.charAt(i) == 'i'||str2.charAt(i) == 'o'||str2.charAt(i) == 'u' ) {
//		count++;
//		}
//		
//	}
//	System.out.println(count);
		
//		//using streams
//		long cou = str2.chars().filter(c->c== 'a'||c== 'e'||c== 'i'||c== 'o'||c=='u').count();
//		System.out.println(cou);
//		
//	String str2 = "programming";
//		char ch ;
//		
//		for(int i = 0 ;i<=str2.length()-1;i++) {
//			ch = str2.charAt(i);
//			if(str2.indexOf(ch) == str2.lastIndexOf(ch)) {
//				System.out.println(ch);
//				break;
//			}
//			
//		} 
		
//		String str = "programming";
//		char ch;
//		
//		for(int i = 0 ;i <str.length() ;i++) {
//				ch= str.charAt(i) ;
//				if (str.indexOf(ch) != str.lastIndexOf(ch)) {
//					System.out.println(ch);
//					break;
//			}
//				
//			
//		}
		
		String str = "programming";
		
		String nonduplicatechar = str.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining());
		System.out.println(nonduplicatechar);
		
//		String str = "programming";
		Map<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c ,Collectors.counting()));
		map.entrySet().forEach((k)-> System.out.println(k.getKey() + "=" +k.getValue() ));
		
		System.out.println("************************");
		
	   Character ch= str.chars().mapToObj(c->(char)c).filter(c-> map.get(c)== 1).findFirst().get();
       System.out.println(ch);
       
       
       System.out.println("************************");
       Character ch1= str.chars().mapToObj(c->(char)c).filter(c-> map.get(c)> 1).findFirst().get();
       System.out.println(ch1);
       
       System.out.println("************************");
       
       //Find the character with the highest frequency.
       Map<Character,Long> highfre  = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
     Map.Entry<Character,Long> max =  highfre.entrySet().stream().max((k1,k2)-> Long.compare(k1.getValue(),k2.getValue())).get();
     System.out.println(max.getKey()  + " = " + max.getValue());
}
}
