package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPrograms {
	
	public static void main(String[] args) {
		
		MapPrograms mapPrograms = new MapPrograms();
		
		int[] arr = {10, 20, 10, 30, 20, 10, 40};
		mapPrograms.frequencyOfNumbers(arr);
		
		System.out.println("-----------------------");
		
		mapPrograms.duplicateNumbersUsingMap(arr);
		
		System.out.println("-----------------------");
		
		String str = "programmming";
		mapPrograms.frequencyOfEachCharacter(str);
		
		String str1 = "swiss";
		System.out.println("-----------------------");
		mapPrograms.firstNonRepeatedChar(str1);
		
		System.out.println("-----------------------");
		mapPrograms.firstRepeatedChar(str);
		
		System.out.println("-----------------------");
		mapPrograms.firstRepeatedCharacterUsingSet(str);
		
		System.out.println("-----------------------");
		mapPrograms.charWithMaxFreq(str);
		
		System.out.println("-----------------------");
		String str2 = "swiss is a country and is a dash";
		mapPrograms.wordFrequency(str2);
		
		System.out.println("-----------------------");
		mapPrograms.wordFrequency(str);
		
		System.out.println("-----------------------");
		String str3 = "aaaabbcc";
		mapPrograms.secondHighestFreqChar(str3);
		
	}
	
	
	public void frequencyOfNumbers(int[] arr) {
		
		Map<Integer,Long> mapFrequency = new HashMap<>();
		for(int i=0;i< arr.length ;i++) {
			mapFrequency.put(arr[i], mapFrequency.getOrDefault(arr[i],0L)+1);
		}
		
		System.out.println(mapFrequency);
		
		
	}
	
	public void duplicateNumbersUsingMap(int[] arr) {
		Map<Integer,Long>  mapDuplicate = new HashMap<>();
		for(int i =0 ;i< arr.length;i++) {
			mapDuplicate.put(arr[i], mapDuplicate.getOrDefault(arr[i],0L)+1);
		}
		for(Map.Entry<Integer, Long> entry : mapDuplicate.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public void frequencyOfEachCharacter(String str) {
		
		HashMap<Character,Integer> mapFreqChar = new HashMap<>() ;
			
		for(int i = 0 ;i < str.length(); i++) {
			char ch = str.charAt(i);
			mapFreqChar.put(ch,mapFreqChar.getOrDefault(ch,0)+1);
			}
		System.out.println(mapFreqChar);
		
	}
	
	public void firstNonRepeatedChar(String str) {
		Map<Character,Integer> mapFirstNonRepeated = new LinkedHashMap<>();
		
		for(int i =0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			mapFirstNonRepeated.put(ch, mapFirstNonRepeated.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry : mapFirstNonRepeated.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	
	public void firstRepeatedChar(String str) {
		Map<Character,Integer> mapFirstRepeated = new LinkedHashMap<>();
		
		for(int i =0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			mapFirstRepeated.put(ch, mapFirstRepeated.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry : mapFirstRepeated.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	
	public void firstRepeatedCharacterUsingSet(String str) {
		
		Set<Character> set1 = new HashSet<>();
		
		for(int i=0 ;i< str.length();i++) {
			if(!set1.add(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		
	}
	
	public void charWithMaxFreq(String str) {
		
		Map<Character,Integer> mapFirstRepeated = new LinkedHashMap<>();
		
		for(int i =0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			mapFirstRepeated.put(ch, mapFirstRepeated.getOrDefault(ch, 0)+1);
		}
		int maxFreq = 0;
		Character charWithMaxFreq = ' ';
		for(Map.Entry<Character,Integer> entry : mapFirstRepeated.entrySet()) {
			if(entry.getValue()>maxFreq) {
				maxFreq =entry.getValue();
				charWithMaxFreq = entry.getKey();
				}
		}
		System.out.println(charWithMaxFreq);
		
	}
	
	public void wordFrequency(String str) {
		String[] word = str.split(" ");
		HashMap<String,Integer> wordFrequency = new HashMap<>();
		for(int i =0 ; i< word.length;i++) {
			String words = word[i];
			wordFrequency.put(words, wordFrequency.getOrDefault(words, 0)+1);	
		}
		System.out.println(wordFrequency);
		
	}
	
	public void secondHighestFreqChar(String str) {
Map<Character,Integer> secondHighestFreqChar = new LinkedHashMap<>();
		
		for(int i =0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			secondHighestFreqChar.put(ch, secondHighestFreqChar.getOrDefault(ch, 0)+1);
		}
		
		int highest = 0;
		int secondHighest = 0;
		char highestChar = ' ';
		char secondHighestChar = ' ';
		for(Map.Entry<Character,Integer> entry : secondHighestFreqChar.entrySet()) {
			int currentFrequency = entry.getValue();
			if(currentFrequency>highest) {
				  secondHighest = highest;
				  secondHighestChar= highestChar ;
				  highest = currentFrequency;
				  highestChar =  entry.getKey();
			}
			else if (currentFrequency > secondHighest && currentFrequency < highest) {
		    secondHighest = currentFrequency;
		    secondHighestChar=  entry.getKey();
			}
		}
		System.out.println(secondHighestChar);
	}
		
	}

