package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDayFour{
	
	public static void main(String... args) {
		
		List<Integer> list1 = Arrays.asList(10, 15, 20, 25, 30);

		// print only even numbers
		list1.stream()
		     .filter(n -> n % 2 == 0)
		     .forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		
		List<String> list2 = Arrays.asList("lakshmi", "sri", "abhi");

		list2.stream()
		     .map(n -> n.toUpperCase())
		     .forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		//Print the squares of only the even numbers.
		
		List<Integer> list3 =Arrays.asList(10, 15, 20, 25, 30);
		
		list3.stream().filter(n->n%2 ==0).map(n-> n*n ).forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		//Print the numbers in ascending order using Streams.
		List<Integer> list4 = Arrays.asList(40, 10, 30, 20, 50);
		list4.stream().sorted().forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		//Print the numbers in descending order using Streams.
		
		List<Integer> list5 = Arrays.asList(40, 10, 30, 20, 50);
		list5.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
       //Print only the unique numbers using Streams.
		List<Integer> list6 = Arrays.asList(10, 20, 10, 30, 20, 40, 30);
		list6.stream().distinct().forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		//Print the first 3 numbers using Streams.
		
		List<Integer> list7 = Arrays.asList(10, 20, 30, 40, 50, 60);
		list7.stream().limit(3).forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		//Skip the first 3 numbers and print the remaining numbers.
		
		List<Integer> list8 = Arrays.asList(10, 20, 30, 40, 50, 60);
		list8.stream().skip(3).forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		//Count how many numbers are even using Streams.
		
		List<Integer> list9 = Arrays.asList(10, 15, 20, 25, 30, 35);
		long count = list9.stream().filter(n->n%2==0).count();
		System.out.println(count);
		
		System.out.println("----------------------------------");
		
		//Find the first even number using Streams.
		List<Integer> list10 = Arrays.asList(15, 25, 30, 40, 50);
		int firstEven = list10.stream().filter(n->n%2==0).findFirst().orElse(-1);
		System.out.println(firstEven);
		
		System.out.println("----------------------------------");
		
		//Find the maximum number using Streams. 
		List<Integer> list11 =Arrays.asList(10, 20, 30, 40, 50); 
		int max = list11.stream().max(Comparator.naturalOrder()).orElse(-1); 
		System.out.println(max);

		//way-2
		int max1 = list11.stream()
                .max(Integer::compareTo)
                .orElse(-1);
		
		//way-3
		list11.stream()
	      .mapToInt(Integer::intValue)
	      .max()
	      .orElse(-1);
		
		System.out.println("----------------------------------");
		
		
		//Find the minimum number using Streams.
		List<Integer> list12 =Arrays.asList(10, 20, 30, 40, 50); 
		int min = list12.stream().min(Comparator.naturalOrder()).orElse(-1); 
		System.out.println(min);
		
		System.out.println("----------------------------------");
		
		//Check whether any number is greater than 25 using Streams.
		
		List<Integer> list13 =Arrays.asList(10, 15, 20, 25, 30);
		boolean matches = list13.stream().anyMatch(n->n>25);
		System.out.println(matches);
		
		System.out.println("----------------------------------");
		
		//Check whether all numbers are greater than 5 using Streams.
		List<Integer> list14 =Arrays.asList(10, 15, 20, 25, 30);
		boolean matchesAll = list14.stream().allMatch(n->n>5);
		System.out.println(matchesAll);
		
		System.out.println("----------------------------------");
		
		//Check whether none of the numbers is negative.
		List<Integer> list15 =Arrays.asList(10, 15, 20, 25, 30);
		boolean matchesNone = list15.stream().noneMatch(n->n<0);
		System.out.println(matchesNone);
		
		System.out.println("----------------------------------");
		
		//Find the sum of all numbers using reduce().
		
		List<Integer> list16 =Arrays.asList(10, 20, 30, 40, 50);
		
		int sumOfAll = list16.stream().reduce(0,(a,b)->a+b);
		System.out.println(sumOfAll);
		
		//way-2
		Optional<Integer> sumOfAllwithoutIdentity = list16.stream().reduce((a,b)->a+b);
		System.out.println(sumOfAllwithoutIdentity.orElse(0));
		
		System.out.println("----------------------------------");
		
		
		//Find the product of all numbers using reduce().
		List<Integer> list17 = Arrays.asList(2, 3, 4, 5);
		int product = list17.stream().reduce(1,(a,b)-> a*b);
		System.out.println(product);
		
		System.out.println("----------------------------------");
		
		Optional<String> name = Optional.of("Lakshmi");
		
		System.out.println(name.orElse("UnKnown"));
		
		System.out.println("----------------------------------");
		
		Optional<String> name1 = Optional.empty();
		
		System.out.println(name1.orElse("UnKnown"));
		
		System.out.println("----------------------------------");
		
		Optional<String> name2 = Optional.of("Lakshmi");
		
		System.out.println(name2.orElse(getDefaultName()));
		
		System.out.println("----------------------------------");
		
		System.out.println(name1.orElseGet(() -> getDefaultName()));
		
		
//		String value = null;
//
//		Optional<String> result = Optional.of(value);
//		System.out.println(result);
		
		
		String value = null;

		Optional<String> result = Optional.ofNullable(value);

		System.out.println(result);
		
		System.out.println("----------------------------------");
		
		Optional<String> name3 = Optional.of("Lakshmi");
		
		System.out.println(name3.map(String::toUpperCase).orElse("UnKnown"));
		
		System.out.println("----------------------------------");
		
		Optional<Integer> age = Optional.of(25);
		
		System.out.println(age.filter(n->n>18).orElse(-1));
		
		System.out.println("----------------------------------");
		
		List<Employee> empList = Arrays.asList(new Employee(1,"Lakshmi",70000,new Department(1,"ECE")),new Employee(2,"Sri",40000,new Department(2,"ECE")),new Employee(3,"Balaji",120000,new Department(3,"CSE")),new Employee(4,"Abhi",10000,new Department(4,"Civil")));
	     empList.stream().filter(emp->emp.getSalary()>60000).map(emp->emp.getName()).forEach(System.out::println);
	     
	     System.out.println("----------------------------------");
	     //Print the names of all employees in uppercase, sorted alphabetically.
	     empList.stream().map(emp-> emp.getName().toUpperCase()).sorted().forEach(System.out::println);
	
	     System.out.println("----------------------------------");
	     
	     //Print the complete Employee objects sorted by salary in descending order.
	     empList.stream() .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
	     
	     System.out.println("----------------------------------");
	     
	     //find the employee with the highest salary using Streams
	     Employee highestSalary = empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
	     System.out.println(highestSalary);
	     
	     System.out.println("----------------------------------");
	     
	     //Find the employee with the lowest salary using Streams.
	     Employee lowestSalary = empList.stream().min(Comparator.comparingDouble(Employee::getSalary)).orElseThrow(()-> new RuntimeException());
	     System.out.println(lowestSalary);
	     
	     System.out.println("----------------------------------");
	     
	     //Count how many employees have a salary greater than 50,000.
	     Long countOfEmployee = empList.stream().filter(emp-> emp.getSalary() > 50000).count();
	     System.out.println(countOfEmployee);
	     
	     System.out.println("----------------------------------");
	     
	     //Calculate the total salary of all employees using Streams.
	     Double totalSumOfsalary = empList.stream().map(emp-> emp.getSalary()).reduce(0.0,(a,b)->(a+b));
	     System.out.println(totalSumOfsalary);
	     
	     System.out.println("----------------------------------");
	     
	     //Calculate the average salary of all employees using Streams.
	     OptionalDouble averageOfsalary = empList.stream().mapToDouble(Employee::getSalary).average();
	     System.out.println(averageOfsalary.getAsDouble());
	     
	     System.out.println("----------------------------------");

	     
	     //group employees by their salary.
	     
	   Map<Double,List<Employee>> groupSalary = empList.stream().collect(Collectors.groupingBy(emp -> emp.getSalary()));
	   groupSalary.entrySet().forEach((entry)-> System.out.println(entry.getKey() + "=" + entry.getValue()));


	   
	   System.out.println("----------------------------------");
	   
	   //group employees by salary and count how many employees are in each salary group.
	   Map<Double,Long> countSalary = empList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
	   
	   countSalary.entrySet().forEach(entry-> System.out.println(entry.getKey() + "=" + entry.getValue()));
	   
	   
	   System.out.println("----------------------------------");
	   
	   //Partition employees based on salary > 60000.
	   
	   Map<Boolean, List<Employee>> result2 =
			    empList.stream()
			           .collect(Collectors.partitioningBy(
			               emp -> emp.getSalary() > 60000
			           ));
	   
	   result2.entrySet().forEach(entry-> System.out.println(entry.getKey() + "="+ entry.getValue()));
	   
	   
	   System.out.println("----------------------------------");
	   
	   //Group employees by department
	   
	 Map<String,List<Employee>> groupBydepartment =   empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));
	 groupBydepartment.entrySet().forEach(entry-> System.out.println(entry.getKey() + " " + entry.getValue()));
	     
	   System.out.println("----------------------------------");
	   
	//Count how many employees are there in each department.
	
    Map<String,Long>  countEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.counting()));
    countEmployee.entrySet().forEach(entry-> System.out.println(entry.getKey() + "="+ entry.getValue()));
    
    //Find the names of employees in each department.
    
    System.out.println("----------------------------------");
    Map<String,List<String>>  employeeNameMap = empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.mapping(Employee::getName,Collectors.toList())));
    employeeNameMap.entrySet().forEach(entry-> System.out.println(entry.getKey() + "="+ entry.getValue()));
    
    System.out.println("----------------------------------");
    //Find the highest salary in each department.
    Map<String,Optional<Employee>> highSalrDep= empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
    highSalrDep.entrySet().forEach(entry-> System.out.println(entry.getKey() + "="+ entry.getValue().get()));
    
    

    System.out.println("----------------------------------");
    //Join all employee names with ", " between them.
    
   String joinedStr =  empList.stream().map(Employee::getName).collect(Collectors.joining(",","[","]"));
   System.out.println(joinedStr);
   
   System.out.println("----------------------------------");
   
   //Get the unique department names from your employees.
   
   Set<String> unique = empList.stream().map(emp->emp.getDepartmentName()).collect(Collectors.toSet());
   System.out.println(unique);
   System.out.println("----------------------------------");
   empList.stream().map(emp->emp.getDepartmentName()).distinct().forEach(emp->System.out.println(emp));
	
	//Get the names of employees belonging to the ECE department, in uppercase and sorted alphabetically.
	empList.stream().filter(emp->"ECE".equals(emp.getDepartmentName())).map(Employee::getName).map(String::toUpperCase).sorted().forEach(emp->System.out.println(emp));
	
	 System.out.println("----------------------------------");
	//Find the department that has the highest-paid employee.
	String maxDept = empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getDepartmentName).orElse("unknown");
	System.out.println(maxDept);
	 System.out.println("----------------------------------");
	//average salary of employees in each department.
	Map<String,Double> avgSalryDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avgSalryDept);
	
	 System.out.println("----------------------------------");
	//Sum salary of employees in each department.
		Map<String,Double> sumSalryDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.summingDouble(Employee::getSalary)));
		System.out.println(sumSalryDept);
		
		 System.out.println("----------------------------------");
		//strings coding
		
		//Find the frequency of each character using Streams.
		String str = "programming";
		Map<Character,Long> countString  = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	    System.out.println(countString);
	    System.out.println("********************************");
	    //Find and print only the duplicate characters using Streams.
	    String str1 = "programming";
		Map<Character,Long> duplicateChar  = str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		duplicateChar.entrySet().stream().filter(entry-> entry.getValue() >1 ).forEach(entry-> System.out.println(entry.getKey()));
	
		  System.out.println("********************************");
		//first non-repeated character in "swiss"
		
		String str2 = "swiss";
		
		Map<Character,Long> nonRepeated = str2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
	Character word = nonRepeated.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().orElse(null);
	     System.out.println(word);
	     
	     System.out.println("********************************");
	     
	    // Find the first repeated character in "programming" using Streams.
	     Map<Character,Long> repChar = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c , LinkedHashMap::new,Collectors.counting()));
	     Character ch =  repChar.entrySet().stream().filter(entry->entry.getValue()>1).map(entry-> entry.getKey()).findFirst().orElse(null);
	     System.out.println(ch);
	     
	     System.out.println("********************************");
	     
	     //Find the character with the maximum frequency in "programming" using Streams.
	     Map<Character,Long> repMaxChar = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c , LinkedHashMap::new,Collectors.counting()));
	     Character repCharM =repMaxChar.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
	    System.out.println(repCharM);
	    
	    System.out.println("********************************");
	    
	    String strhello="hello";
	    String reverseStr = IntStream.range(0,strhello.length()).mapToObj(i->strhello.charAt(strhello.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
	     System.out.println(reverseStr);
	     
	     System.out.println("********************************");
	     
	     //Count the number of vowels in "programming" using Streams.
	     Long countVowels = str.chars().filter(c-> c=='a' || c=='e'|| c=='i'||c=='o'||c=='u' ).count();
	     System.out.println(countVowels);
	     System.out.println("********************************");
	     
	     //find the frequency of each word in a sentence.
	     String strSentence = "Java is very is";
	    Map<String,Long> freqCount = Arrays.stream(strSentence.split(" ")).collect(Collectors.groupingBy(word1->word1,Collectors.counting()));
	    System.out.println(freqCount);
	    System.out.println("********************************");
	    
	    //Distinct characters in prpgramming string
	    
	    str.chars().mapToObj(c->(char)c).distinct().forEach(c->System.out.println(c));;
	   //Remove duplicate characters from "programming" and return the result as a String.
	    String stres = str.chars().mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining());
	    System.out.println(stres);
	    System.out.println("********************************");
	    
	    //Reverse each word in "Java is easy" → "avaJ si ysae".
	    String collect = Arrays.stream(strSentence.split(" ")).map(strb -> new StringBuilder(strb).reverse().toString()).collect(Collectors.joining(" "));
	    System.out.println(collect);
	    
	    System.out.println("********************************");
	    
	    //occur more than once
	  Map<Character,Long> strMoreOnce =  str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
	  Character moreonce = strMoreOnce.entrySet().stream().filter(entry-> entry.getValue()>1).map(entry-> entry.getKey()).findFirst().get();
	  System.out.println(moreonce);
	}
	public static String getDefaultName() {
	    System.out.println("Default method executed");
	    return "Unknown";
	}
}