package com.strings;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringProblems {
	
	public static void main(String... strings) {
		
		//problem-1 : First non-repeated character
		
		String str = "programming";
		
		Map<String,Long> nonrepeatedchar = str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(nonrepeatedchar);
		
		Map.Entry<String,Long> result1 = nonrepeatedchar.entrySet().stream().filter(c-> c.getValue()==1).findFirst().get();
		System.out.println(result1);
		
		//or
		String result2 = nonrepeatedchar.entrySet().stream().filter(c-> c.getValue()==1).map(c->c.getKey()).findFirst().get();
		System.out.println(result2);
		
		//or
		Optional<Character> result3 = str.chars().mapToObj(c->(char)c).filter(c-> nonrepeatedchar.get(String.valueOf(c))==1).findFirst();
		System.out.println(result3.get());
		
		System.out.println("************************************");
		
		//problem-2 : First repeated character
		
		
		Map<String,Long> repeatedchar = str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(repeatedchar);
		
		Map.Entry<String,Long> result4 = nonrepeatedchar.entrySet().stream().filter(c-> c.getValue()>1).findFirst().get();
		System.out.println(result4);
		
		//or
		String result5 = repeatedchar.entrySet().stream().filter(c-> c.getValue()>1).map(c->c.getKey()).findFirst().get();
		System.out.println(result5);
		
		//or
		Optional<Character> result6 = str.chars().mapToObj(c->(char)c).filter(c-> nonrepeatedchar.get(String.valueOf(c))>1).findFirst();
		System.out.println(result6.get());
		
		System.out.println("************************************");
		
		//problem 3 Count the number of vowels (a, e, i, o, u) in the String.
		
		Long count = str.chars().mapToObj(c->(char)c).filter(c-> c =='a'|| c== 'e' || c=='i'|| c=='o' || c=='u').count();
		System.out.println(count);
		
		
		
		
	}

}
