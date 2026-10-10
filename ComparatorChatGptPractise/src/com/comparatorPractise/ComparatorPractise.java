package com.comparatorPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparatorPractise {
	
	public static void main(String... args) {
		
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(1,"zeven",20000);
		Employee emp2 = new Employee(2,"Sri",20000);
		Employee emp3 = new Employee(3,"Abhi",100000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		
//		Collections.sort(empList,new SalaryComparator());
//		System.out.println(empList);
//		
//		Collections.sort(empList,new NameComparator());
//		System.out.println(empList);
		
		Comparator<Employee> res = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName);
	    empList.sort(res);
	    //Collections.sort(empList,res);
	    System.out.println(empList);
	    
	   


	    System.out.println("-------------------------");
	    
	    //salary descending + name ascending
	    
	    Comparator<Employee> res2 = Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName);
	    empList.sort(res2);
	    System.out.println(empList);
	    
	    System.out.println("-------------------------");
	    
	    //name descending + salary ascending
	    
	    Comparator<Employee> res3 = Comparator.comparing(Employee::getName).reversed().thenComparingDouble(Employee::getSalary);
	    empList.sort(res3);
	    System.out.println(empList);
	    
	    System.out.println("-------------------------");
	    
	    //find employee with highest salary
	     Employee max = Collections.max(empList,new SalaryComparator());
	     System.out.println(max);
	     
	     System.out.println("-------------------------");
	     
		     Map<String,Integer> map = new HashMap<>();
		     map.put("Lakshmi", 40000);
		     map.put("Sri", 100000);
		     map.put("Abhi", 20000);
		     
		     map.entrySet().stream().sorted(Comparator.comparingDouble(Map.Entry::getValue)).forEach(System.out::println);
		     
		     
		     Employee maxHigest = Collections.max(empList,Comparator.comparing(Employee::getSalary));
			 System.out.println(maxHigest);
	     
	     
	    
	    
	}

}
