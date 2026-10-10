package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	
	public static void main(String[] args) {
		
		List<Student> std = new ArrayList<>();
		
		Student std1= new Student(1,"Lakshmi","Gudivada");
		Student std2 = new Student(2,"Tim","Singapore");
		Student std3 = new Student(3,"Virat","Delhi");
		Student std4 = new Student(4,"Rajat","Indore");
		
	    std.add(std1);
	    std.add(std2);
	    std.add(std3);
	    std.add(std4);
	    
//		System.out.println(std1);
//		System.out.println(std2);
		
		Collections.sort(std,new NameComparator());
		System.out.println(std);
		
	}

}
