 package com.string.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCoding {
	
	public static void main(String...strings) {
	
		StringCoding strcoding = new StringCoding();
		strcoding.reverseOfStringBasicForLoop("hello");
		
		strcoding.reverseOfStringUsingStreams("hello");
		
		strcoding.reverseOfStringUsingReduce("hello");
		
		strcoding.reverseOfStringUsingStreamBuilderAndStream("hello");
		
		strcoding.reverseOfStringUsingStreamBuilder("hello");
		
		strcoding.palindromeUsingBasicForLoop("hello");
		
		strcoding.palindromeUsingStringBuilder("madam");
		
		strcoding.palindromeUsingtwoPointerAproach("madam");
		
		strcoding.palindromeUsingIntStream("madam");
		
		strcoding.countVowelsBasicForLoop("banana");
		
		strcoding.countOfVowelsUsingSwitch("banana");
		
		strcoding.countOfVowlesUsingIndexOf("banana");
		
		strcoding.countOfVowlesUsingstreamFilter("banana");
		
		strcoding.countOfVowelsUsingstream("banana");
		
		strcoding.characterFrequencyUsingBasicForloopNonDuplicate("programming");
		
		strcoding.characterFrequencyUsingMap("programming");
		
		strcoding.characterfrequencyUsingStream("programming");
		
		strcoding.printDuplicateCharacters("Programming");
		
		strcoding.printDuplicateCharacterUsingStream("programming");
		
		strcoding.printDuplicateCharacterUsingMap("programming");
		
		strcoding.firstNonRepeatedCharacter("madams");
		
		strcoding.firstNonRepeatedCharacterUsingMap("madams");
		
		strcoding.firstNonRepeatedCharacterUsingStream("madams");
		
		strcoding.firstRepeatedCharacter("programming");
		
		strcoding.firstRepeatedCharacterUsingMap("programming");
		
		strcoding.firstRepeatedCharacterUsingStreams("programming");
		
		strcoding.firstRepeatedCharacterusingSet("programming");
		
		strcoding.firstRepeatedCharacterUsingStreamAndIndexOf("programming");
		
		strcoding.removeDuplicateCharacters("swiss");
		
		strcoding.removeDuplicateCharactersUsingSet("swiss");
		
		strcoding.removeDuplicateCharacterUsingStream("swiss");
		
		strcoding.removeDuplicateCharacterUsingStreamAndDistinct("swiss");
		
		strcoding.reverseEachWord("Java is Easy");
		
		strcoding.reverseEachUsingStringBuilder("Java is Easy");
		
		strcoding.reverseEachWordUsingCharArrayAndLoop("Java is Easy");
	
		strcoding.reverseEachWordUsingIndexBasedOuterLoop("Java is Easy");
		
		strcoding.longestword("Java is very powerful");
		
		strcoding.longestWordUsingIndexBasedLoop("Java is very powerful");
		
		strcoding.longestWordUsingStream("Java is very powerful");
		
		
		
	}
	
	public void reverseOfStringBasicForLoop(String str) {
		//Basic Approach 
		String reverse = "";
		for(int i = str.length()-1;i>=0; i--) {
			reverse+= str.charAt(i);
		}
		System.out.println(reverse);
	}
	
	public void reverseOfStringUsingStreams(String str) {
		String reverseStr = IntStream.range(0, str.length()).mapToObj(i->str.charAt(str.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
	    System.out.println(reverseStr);
	}
	
	public void reverseOfStringUsingReduce(String str) {
		String reverse = str.chars().mapToObj(c->String.valueOf( (char)c)).reduce("",(a,b)-> b+a);
		System.out.println(reverse);
		
	}
	
	public void reverseOfStringUsingStreamBuilderAndStream(String str) {
		
		String reverse = str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.collectingAndThen(Collectors.joining(),s-> new StringBuilder(s).reverse().toString()));
	    System.out.println(reverse);
	}
	
	public void reverseOfStringUsingStreamBuilder(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
		
	}
	
	
	public void palindromeUsingBasicForLoop(String str) {
		String reverse = "";
		for(int i =str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);	
		}
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public void palindromeUsingStringBuilder(String str) {
		String reverse= new StringBuilder(str).reverse().toString();
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public void palindromeUsingtwoPointerAproach(String str) {
		boolean palindrome = true;
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!= str.charAt(right)) {
				palindrome = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(palindrome?"Palindrome":"Not a Palindrome");
	}
	
	public void palindromeUsingIntStream(String str) {
		boolean palindrome = IntStream.range(0,str.length()/2).allMatch(i->str.charAt(i)== str.charAt(str.length()-1-i));
		System.out.println(palindrome?"Palindrome":"Not a Palindrome");
		
	}
	
	public void countVowelsBasicForLoop(String str) {
		int count =0;
		for(int i =0 ;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void countOfVowelsUsingSwitch(String str) {
		int count = 0;
		for(char ch : str.toCharArray())
		{
			switch(ch) {
			case 'a','e','i','o','u'-> count++;
			}
		}
		System.out.println(count);

		
	}
	
	public void countOfVowlesUsingIndexOf(String str) {
		int count = 0 ;
		for(char ch : str.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void countOfVowlesUsingstreamFilter(String str) {
		
		long count = str.chars().filter(i-> "aeiou".indexOf(i) != -1).count();
		System.out.println(count);
	}
	
	public void countOfVowelsUsingstream(String str) {
		
		long count = str.chars().filter(i-> i=='a'|| i=='e'|| i=='i'|| i =='o'|| i=='u').count();
		System.out.println(count);
	}
	
	public void characterFrequencyUsingBasicForloopNonDuplicate(String str) {
		
		boolean[] visited = new boolean[str.length()];
		
		for(int i = 0 ; i <str.length();i++) {
		if(visited[i]) {
			continue;
		}
		int count = 1;
		
		for(int j = i+1 ; j< str.length();j++) {
			if(str.charAt(i)== str.charAt(j)) {
				count++;
				visited[j]= true;
			}
		}
		System.out.println(str.charAt(i) + "=" + count);
		}
		
		
	}
	
	public void characterFrequencyUsingMap(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey() +"="+entry.getValue()));
		
		
	}
	
	public void characterfrequencyUsingStream(String str) {
		Map<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+"="+entry.getValue()));
		
		
	}
	
	public void printDuplicateCharacters(String str) {
		Set<Character> set = new HashSet<>();
		List<Character> li = new LinkedList<>();
		
		for(char ch : str.toCharArray()) {
			if(!set.add(ch)) {
				li.add(ch);
			}
		}
		System.out.println(li);
		
	}
	
	public void printDuplicateCharacterUsingStream(String str) {
		 str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(entry-> entry.getValue()>1).forEach(entry->System.out.println(entry.getKey()));	
	}
	
	public void printDuplicateCharacterUsingMap(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);	
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public void firstNonRepeatedCharacter(String str) {
		for(int i =0 ;i<str.length();i++) {
			int count=0;
			for(int j=0 ;j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
	
	public void firstNonRepeatedCharacterUsingMap(String str) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);	
		}
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
	
	public void firstNonRepeatedCharacterUsingStream(String str) {
		 Entry<Character, Long> entry2 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry-> entry.getValue()==1).findFirst().orElse(null);
		 System.out.println(entry2.getKey());
	}
	
	public void firstRepeatedCharacter(String str) {
		
		for(int i =0 ;i< str.length();i++) {
			int count =0;
			for(int j=0 ;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
	
	public void firstRepeatedCharacterUsingMap(String str) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			if(map.get(ch)==2) {
				System.out.println(ch);
				break;
			}
		}	
		
	}
	
	
	public void firstRepeatedCharacterUsingStreams(String str) {
		Entry<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==2).findFirst().orElse(null);
	     System.out.println(map.getKey());
	}
	
	public void firstRepeatedCharacterusingSet(String str) {
		Set<Character> set = new HashSet<>();
		for(char ch: str.toCharArray())
		{
			if(!set.add(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}
	
	public void firstRepeatedCharacterUsingStreamAndIndexOf(String str) {
		Character res = str.chars().mapToObj(c->(char)c).filter(c->str.indexOf(c)!= str.lastIndexOf(c)).findFirst().orElse(null);
		System.out.println(res);
	}
	
	public void removeDuplicateCharacters(String str) {
		String result = "";
		for(int i= 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!result.contains(String.valueOf(ch))) {
				result+=ch;
			}
		}
		System.out.println(result);
	}
	
	public void removeDuplicateCharactersUsingSet(String str) {
		
		Set<Character> set = new HashSet<>();
		
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(set.add(ch)) {
				result.append(ch);
			}
		}
		System.out.println(result);
		
		
	}
	
	public void removeDuplicateCharacterUsingStream(String str) {
		 String collect = str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.toCollection(LinkedHashSet::new)).stream().collect(Collectors.joining());
	     System.out.println(collect);
	}
	
	public void removeDuplicateCharacterUsingStreamAndDistinct(String str) {
		String res = str.chars().mapToObj(c->(char)c).distinct().map(c->String.valueOf(c)).collect(Collectors.joining());
		System.out.println(res);
	}
	
	
	public void reverseEachWord(String str) {
		String[] str1 = str.split(" ");
		for(String st : str1) {
			String reverse = "";
			for(int i = st.length()-1;i>=0;i--) {
				reverse+=st.charAt(i);
			}
			System.out.print(reverse+ " ");
		}
		System.out.println("");
	}
	
	public void reverseEachUsingStringBuilder(String str) {
		String[] str1 = str.split(" ");
		
		for(String st : str1) {
			StringBuilder sb = new StringBuilder();
			for(int i= st.length()-1;i>=0;i--) {
				sb.append(st.charAt(i));
			}
			System.out.print(sb+" ");
		}
		System.out.println("");
	}
	
	public void reverseEachWordUsingCharArrayAndLoop(String str) {
		String[] str1 = str.split(" ");
		for(String st : str1) {
			char[] ch = st.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
		System.out.println("");
	}
	
	public void reverseEachWordUsingIndexBasedOuterLoop(String str) {
		String[] str1 = str.split(" ");
		for(int i = 0 ;i< str1.length;i++) {
			String reverse = "";
			for(int j = str1[i].length()-1;j>=0;j--) {
				reverse+=str1[i].charAt(j);	
			}
			System.out.print(reverse+ " ");
		}
		System.out.println("");
	}
	
	public void longestword(String str) {
		String[] str1 = str.split(" ");
		String longest = "";
		for(String word : str1) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
	}
	
	public void longestWordUsingIndexBasedLoop(String str) {
		String[] str1 = str.split(" ");
		String longest= "";
		for(int i = 0 ;i< str1.length ;i++) {
			if(str1[i].length()>longest.length()) {
				longest= str1[i];
			}
			
		}
		System.out.println(longest);
	}
	
	public void longestWordUsingStream(String str) {
		String longest = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(longest);
	}
	
	
	
	
	
	

}
