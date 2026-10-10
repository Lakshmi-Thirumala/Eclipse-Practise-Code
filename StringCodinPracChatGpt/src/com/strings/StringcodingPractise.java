package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringcodingPractise {
	
	public static void main(String[] args) {
		
		StringcodingPractise stcp = new StringcodingPractise();
		String reverseString = stcp.reveseOfString("FLMEDUTECH");
		System.out.println(reverseString);
		
		System.out.println("---------------------------");
		
		boolean palindromeString = stcp.isPanlindromeString("DAD");
		System.out.println(palindromeString);
		
		System.out.println("---------------------------");
		
		stcp.vowelConsonantCount("FLMEDUTECH123@ ");
		
	    System.out.println("---------------------------");
		
		stcp.characterFrequency("FLMEDUTECH");
		
		 System.out.println("---------------------------");
			
		stcp.frequencyUsingMAp("FLMEDUTECH");
		
		 System.out.println("---------------------------");
		
		stcp.duplicateChars("MOM");
		
		 System.out.println("---------------------------");
			
	     stcp.finDuplicateUsingMap("swwissdd");
	     
	     System.out.println("---------------------------");
			
	     stcp.finDuplicateUsingLinkedHashMap("swwissdd");
	     
	     System.out.println("---------------------------");
			
	     stcp.nonRepeatedCharacterUsingMap("swiss");
	     
	     System.out.println("---------------------------");
			
	     stcp.removeDuplicateCharacterUsingMap("programming");
	     
	     System.out.println("---------------------------");
			
	     stcp.removeDuplicatesUsingLinkedHasSet("programming");
	     
	     System.out.println("---------------------------");
			
	     stcp.anagramUsingMap("silent","listen");
	     
	     System.out.println("---------------------------");
			
	     stcp.firstRepeatedCharacterUsingMap("programming");
	     
	     System.out.println("---------------------------");
			
	     stcp.reverseWordinString("Java is easy");
	     
	     System.out.println("---------------------------");
			
	     stcp.longestWordinString("Java is powerful");
	     
	     System.out.println("---------------------------");
			
	     stcp.countWordinString("Java is powerful");
	     
	     System.out.println("---------------------------");
			
	    boolean res=  stcp.stringContainsOnlyDigits("12345r");
	     
	     System.out.println(res);
	     
	     System.out.println("---------------------------");
			
		  stcp.maxOccuringUsingMap("programming");
		     
		    
}
	
	
	public String reveseOfString(String str) {
		String  rev = "";
		for(int i =str.length()-1;i>=0 ;i--) {
			rev = rev + str.charAt(i);	
	}
		return rev;
		
	
	}
	
	public boolean isPanlindromeString(String str) {
		String rev = "";
		
		for(int i = str.length()-1 ;i >=0 ; i--) {
			rev = rev+ str.charAt(i);
		}
		if(rev.equals(str)) {
			return true;
		}
		return false;
	}
	
	public void vowelConsonantCount(String str) {
		int vowelCount = 0;
		int consonantCount= 0 ;
		String strlowerCase = str.toLowerCase();
		for(int i = 0 ; i<  strlowerCase.length() ; i++) {
			if(strlowerCase.charAt(i) == 'a' || strlowerCase.charAt(i) == 'e'||strlowerCase.charAt(i) == 'i'||strlowerCase.charAt(i) =='o'||strlowerCase.charAt(i) =='u') {
				vowelCount++;
			}
			else if(Character.isLetter(strlowerCase.charAt(i))) {
				consonantCount++;	
			}
			
		}
		System.out.println("Vowel count="+vowelCount+"  "+ "and Consonant count=" + consonantCount);
	}
	
	public void characterFrequency(String str) {
		
		for(int i= 0 ;i <str.length();i++) {//banana
			int count = 0;
			boolean alreadyCounted = false;
			for(int k=0 ;k<i ;k++) {
				if(str.charAt(i)== str.charAt(k)) {
					alreadyCounted=true;
					break;
				}}
			if(!alreadyCounted) {
			for(int j = 0;j < str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				}
			}
			System.out.println("frequency of "+ str.charAt(i) + "= "+ count);
				}
			
			}

	}
	
	public void frequencyUsingMAp(String str) {
		HashMap<Character,Long> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0L)+1);	
		}
		for(Map.Entry<Character,Long> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + "="+ entrySet.getValue());
		}
		
	}
	
	public void duplicateChars(String str) {
		for(int i = 0 ;i< str.length();i++) {
			boolean alreadyPrinted= false;
			for(int k=0 ;k<i;k++){
				if(str.charAt(k)== str.charAt(i)) {
					alreadyPrinted=true;
				}
			}
			if(!alreadyPrinted) {
			for(int j= i+1;j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					System.out.println(str.charAt(i));
					break;
				}
			}
			}
		}
	}
	
	public void finDuplicateUsingMap(String str) {
		HashMap<Character,Long> map1 = new HashMap<>();
		for(int i = 0 ;i < str.length();i++) {
			char ch = str.charAt(i);
			map1.put(ch,map1.getOrDefault(ch, 0L)+1);
		}
		for(Map.Entry<Character,Long> entryset : map1.entrySet()) {
			if(entryset.getValue()>1) {
				System.out.println(entryset.getKey());
			}
		}
	}
	
	public void finDuplicateUsingLinkedHashMap(String str) {
		HashMap<Character,Long> map2 = new LinkedHashMap<>();
		for(int i = 0 ;i < str.length();i++) {
			char ch = str.charAt(i);
			map2.put(ch,map2.getOrDefault(ch, 0L)+1);
		}
		for(Map.Entry<Character,Long> entryset : map2.entrySet()) {
			if(entryset.getValue()>1) {
				System.out.println(entryset.getKey());
			}
		}
	}
	
	public void nonRepeatedCharacterUsingMap(String str) {
		HashMap<Character,Long> map2 = new LinkedHashMap<>();
		for(int i = 0 ; i< str.length();i++) {
			char ch = str.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0L)+1);
			
		}
		for(Map.Entry<Character, Long> entryset : map2.entrySet()) {
			if(entryset.getValue()== 1) {
				System.out.println(entryset.getKey());
				break;
			}
			
		}
	}
	
	public void removeDuplicateCharacterUsingMap(String str) {
		Map<Character,Long> map3 = new LinkedHashMap<>();
		for(int i = 0 ; i< str.length();i++) {
			char ch = str.charAt(i);
			map3.put(ch, map3.getOrDefault(ch, 0L)+1);
			
		}
		for(Map.Entry<Character, Long> entryset : map3.entrySet()) {
				System.out.print(entryset.getKey());
			}
		System.out.println("");
			
		}

   public void removeDuplicatesUsingLinkedHasSet(String str) {
	   Set<Character> set = new LinkedHashSet<>();
	   for(int i =0 ;i<str.length();i++) {
		   set.add(str.charAt(i));
	   }
	  // System.out.println(set);
	   for(Character sets : set ) {
		   System.out.print(sets);
		   
	   }
	   System.out.println("");
	   
   }
   
   public void anagramUsingMap(String str1,String str2) {
		Map<Character,Long> map4 = new LinkedHashMap<>();
		for(int i = 0 ; i< str1.length();i++) {
			char ch = str1.charAt(i);
			map4.put(ch, map4.getOrDefault(ch, 0L)+1);
			
		}
		
		Map<Character,Long> map5 = new LinkedHashMap<>();
		for(int i = 0 ; i< str2.length();i++) {
			char ch = str2.charAt(i);
			map5.put(ch, map5.getOrDefault(ch, 0L)+1);
			
		}
		
		if(map4.equals(map5)) {
			System.out.println("Given two strings are anagrams");
		}
		else {
			System.out.println("Given two strings are  not anagrams");
		}
			
		}
   
   public void firstRepeatedCharacterUsingMap(String str) {
		  Set<Character> set = new LinkedHashSet<>();
		   for(int i =0 ;i<str.length();i++) {
			   char ch = str.charAt(i);
			 boolean result  = set.add(ch);
			 if(!result) {
				 System.out.println(ch);
				 break;
			 }
		
	
			
			
		}
}
   
   public void reverseWordinString(String str) {
	  String[] strReverse = str.split(" ");
	  System.out.println(Arrays.toString(strReverse));
	  for(int i=0 ;i< strReverse.length;i++) {
		  String word = strReverse[i];
		  String rev="";
		  for(int j= word.length()-1 ;j>=0;j--) {
			 rev = rev +  word.charAt(j);	  
		  }
		  System.out.print(rev + " ");
	  }
	  System.out.println("");
	  
   }
   
   public void longestWordinString(String str) {
		  String[] strlong = str.split(" ");
		  int maxLength = 0;
		  String longestword="";
		  for(int i=0 ;i< strlong.length;i++) {
			  String word = strlong[i];
			  int count = word.length();
			  if(count >maxLength) {
				  maxLength=count;
				  longestword= word;
			  }
			 
		  }
		  System.out.println(longestword);
		  
	   }
   
   public void countWordinString(String str) {
		  String[] strlong = str.split(" ");
//		  int wordCount = 0;
//		  for(int i=0 ;i< strlong.length;i++) {
//			  wordCount++;
//		  }
//		  System.out.println(wordCount);
		  System.out.println(strlong.length);
		  
	   }
   
   public boolean stringContainsOnlyDigits(String str) {
	   for(int i = 0 ;i< str.length();i++) {
		  char ch =  str.charAt(i);
		   if(!Character.isDigit(ch)) {
			  return false;			   
		   }
		   
	   }
	 return true;
	   
   }
   
   public void maxOccuringUsingMap(String str) {
		HashMap<Character,Long> map1 = new LinkedHashMap<>();
		for(int i = 0 ;i < str.length();i++) {
			char ch = str.charAt(i);
			map1.put(ch,map1.getOrDefault(ch, 0L)+1);
		}
		long maxCount = 0;
		char maxChar = ' ';
		for(Map.Entry<Character,Long> entryset : map1.entrySet()) {
			if(entryset.getValue() > maxCount) {
			    maxCount = entryset.getValue();
			    maxChar = entryset.getKey();
			}
		}
		System.out.println(maxChar);
	}
}
