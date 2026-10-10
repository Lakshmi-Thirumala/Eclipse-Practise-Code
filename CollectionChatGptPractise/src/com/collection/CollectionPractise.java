package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionPractise {
	
	public static void main(String...strings) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list.remove(2));//return removed elemet
		System.out.println(list.set(1, 40));//return replaced element
		System.out.println(list.remove(Integer.valueOf(10)));// true if it finds element and remove
		list.add(59);
		list.add(89);
		list.add(40);
		System.out.println(list);
		
		for(Integer ele : list) {
			System.out.print(ele+ " ");
		}
		System.out.println(" ");
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		System.out.println(" ");
		String string = list.toString();
		
		System.out.println(string);
		
		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println(list.subList(1,3));
		
		System.out.println(list.indexOf(40));
		
		System.out.println(list.lastIndexOf(40));
//        list.clear();
//		System.out.println(list);
		
		
		List li = new ArrayList<>(List.of(20,30,40,50));
		
		System.out.println(list.retainAll(li));
		System.out.println(list);
		
		System.out.println(li.removeAll(list));
		System.out.println(li);
		
		int[] arr = {10,20,30,40,20,10};
		Set set = new HashSet();
//		for(int j= 0 ;j<arr.length;j++) {
//			set.add(arr[j]);	
//			
//		}
//		System.out.println(set);
		
		for(int k : arr) {
			set.add(k);
		}
		System.out.println(set);
		
		
		int[] arr1 = {10, 20, 30, 20, 40, 10};
		
		Set<Integer> set2 = new HashSet<>();
		for(int s :arr1) {
			if(!set2.add(s)) {
				System.out.println(s);
			}
		}
		
		
		Set<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(19);
		treeSet.add(30);
		treeSet.add(19);
		treeSet.add(20);
		
		Set<Integer> treeSet2 = new TreeSet<>();
		treeSet2.add(87);
		treeSet2.add(65);
		treeSet2.add(54);
		
		System.out.println(treeSet);
		
		boolean contains = treeSet.contains(19);
		System.out.println(contains);
		
		boolean contains1 = treeSet.contains(100);
		System.out.println(contains1);
		
		System.out.println(treeSet.equals(treeSet2));
		
		System.out.println(treeSet.isEmpty());
		
		System.out.println(treeSet2.removeIf(n->n>20));
		
		System.out.println(treeSet2);
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(45);
		l.add(50);
		
//		for(int d : l) {
//			if(d==20) {
//				l.remove(Integer.valueOf(d));
//			}
//		}
		
		
		  Map<String,String> map = new HashMap<>();
	      map.put("name" ,"Lakshmi");
	      map.put("company","cognizant");
	      
	      for(Map.Entry<String,String> entrySet :map.entrySet()) {
	    	  
	    	  System.out.println(entrySet.getKey());
	    	  System.out.println(entrySet.getValue());
	    	  
	      }
		
		
		Iterator<Integer> iterator2 = l.iterator();
		while(iterator2.hasNext()) {
			Integer loop =iterator2.next();
			
			if(loop==20) {
				iterator2.remove();
				
				
			}
		}
		
		System.out.println(l);
		
		CopyOnWriteArrayList<Integer> ist =
		        new CopyOnWriteArrayList<>();

		ist.add(10);
		ist.add(20);
		ist.add(30);
		
		for(int di : ist) {
			if(di==20) {
				ist.remove(Integer.valueOf(20));
			}
		}
		
		System.out.println(ist);
		
		
		
		Iterator<Integer> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if(next== 30) {
		        iterator.remove();
			}
		}
	System.out.println(treeSet);
	
	
			
	    
		
	}	
	
  
      
		
		
	}
