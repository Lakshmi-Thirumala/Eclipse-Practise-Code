package com.chatGpt.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Practise {
	
	public static void main(String...  args) {
		
		//problem 1 -for the given list print even numbers
		List<Integer> nums1 = Arrays.asList(10,15,20,25,30,35,40);
		nums1.stream().filter(n->n%2==0).forEach(num->System.out.println(num));
		
		System.out.println("*********************************************");
		
		//problem-2 -Filter the even numbers and then double each even number.
		List<Integer> nums2 = Arrays.asList(10,15,20,25,30,35,40);
		nums2.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));
		
		System.out.println("*********************************************");
		
		//problem-3-Square every number and store the result in a new List.
		List<Integer> nums3 = Arrays.asList(1,2,3,4,5);
		List<Integer> res = nums3.stream().map(n->n*n).toList();
		System.out.println(res);
		
		System.out.println("*********************************************");
		
		//problem-4 -Find all numbers greater than 20, multiply them by 3, and store the result in a new List.
         List<Integer>  nums4 = Arrays.asList(5,10,15,20,25,30,35,40);
         List<Integer> res2 = nums4.stream().filter(n->n>20).map(n->n*3).toList();
		 System.out.println(res2);
		 
		 System.out.println("*********************************************");
		 
		 //problem-5 Find all numbers greater than 15 and sort them in ascending order.
		 List<Integer> nums5= Arrays.asList(45, 10, 30, 5, 20, 50, 15);
		 nums5.stream().filter(n->n>15).sorted().forEach(n->System.out.println(n));
		 
		 System.out.println("*********************************************");
		 
		 
		 //problem -6 --Remove the duplicate numbers and store the unique numbers in a new List.
		 List<Integer> nums6 = Arrays.asList(10, 20, 10, 30, 20, 40, 30, 50);
		 List<Integer> res3 = nums6.stream().distinct().toList();
		 System.out.println(res3);
		 
		 System.out.println("*********************************************");
		 
		 //problem7 - Find the numbers greater than 20, remove duplicates, and sort them in ascending order.
		 List<Integer> nums = Arrays.asList(15, 30, 10, 25, 30, 40, 15, 50, 20, 40);
		 nums.stream().filter(n->n>20).distinct().sorted().forEach(n->System.out.println(n));
		 
		 System.out.println("*********************************************");
		 
		 //problem -8 -Find the sum of all numbers using Streams.-using reduce
		 List<Integer> nums8 = Arrays.asList(10, 20, 30, 40, 50);
		 Integer res4= nums8.stream().reduce(0,(a,b)->(a+b));	 
		 System.out.println(res4);
		 
		 System.out.println("*********************************************");
		 
		 //problem-9 Find the product of all numbers using reduce().
		 
		 List<Integer> nums9 = Arrays.asList(2, 3, 4, 5);
		 Integer res5 = nums9.stream().reduce(1,(a,b)->a*b);
		 System.out.println(res5);
		 
		 System.out.println("*********************************************");
		 
		 //problem-10 Find the maximum number using Streams.
		 List<Integer> nums10 = Arrays.asList(10, 25, 30, 15, 40, 5, 50);
		 Integer max = nums10.stream().mapToInt(n->n).max().getAsInt();
		 System.out.println(max);
		 
		 System.out.println("*********************************************");
		 
		//problem-11 Find the maximum number using Streams.--using reduce
		 List<Integer> nums11 = Arrays.asList(10, 25, 30, 15, 40, 5, 50);
		 Integer max1 = nums11.stream().reduce(nums11.get(0),(a,b)->(a>b)?a:b);
		 System.out.println(max1);
		 
		 System.out.println("*********************************************");
		 
		 //problem-12 Find the maximum number using reduce() without providing an initial/identity value.
		 List<Integer> nums12 = Arrays.asList(10, 25, 30, 15, 40, 5, 50);
		 Optional<Integer> res6 = nums12.stream().reduce((a,b)-> (a>b)?a:b);
		 System.out.println(res6.get());
		 
		 System.out.println("*********************************************");
		 
		 //problem-13 Find the minimum number using reduce() without an identity value.
		 List<Integer> nums13 = Arrays.asList(35, 10, 25, 5, 40, 15, 30);
		 Integer res7 = nums13.stream().reduce((a,b)-> (a<b?a:b)).get();
		 System.out.println(res7);
		 
		 System.out.println("*********************************************");
		 
		 //Problem 14 — Sum of only even numbers
		 List<Integer> nums14 = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		 Integer res8 = nums14.stream().filter(n->n%2==0).reduce((a,b)-> (a+b)).get();
		 System.out.println(res8);
		 
		 System.out.println("*********************************************");
		 
		 //Problem 15 — Average of numbers
		 List<Integer> nums15 = Arrays.asList(10, 20, 30, 40, 50);
		 OptionalDouble avg= nums15.stream().mapToInt(n->n).average();
		 System.out.println(avg.getAsDouble());
		 
		 System.out.println("*********************************************");
		 
		 //Problem 16 — Count numbers--greater than 20 
		 List<Integer> nums16 = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		 long count = nums16.stream().filter(n->n>20).count();
		 System.out.println(count);
		 
		 System.out.println("*********************************************");
		 
		 //Problem 17 —Find the first number greater than 20.
		 List<Integer> nums17 = Arrays.asList(15, 25, 10, 30, 40, 5);
		 Optional<Integer> findfirst = nums17.stream().filter(n->n>20).findFirst();
		 System.out.println(findfirst.get());
		 
		 System.out.println("*********************************************");
		 
		 //Problem 18 — Find any number greater than 20.
		 List<Integer> nums18 = Arrays.asList(10, 15, 20, 25, 30, 35);
		 Integer findAny = nums18.stream().filter(n->n>20).findAny().get();
		 System.out.println(findAny);
		 
		 System.out.println("*********************************************");
		 
		 
		 //problem 19
//		 Do all of the following:
//
//			 Keep only numbers greater than 15
//			 Double those numbers
//			 Remove duplicates
//			 Sort them in descending order
//			 Store the result in a new List
		 
		 List<Integer> nums19 = Arrays.asList(12, 5, 18, 25, 30, 7, 42, 18, 25);
		 List<Integer> res9 = nums19.stream().filter(n->n>15).map(n->n*2).distinct().sorted(Comparator.reverseOrder()).toList();
		 System.out.println(res9);
		 
		 System.out.println("*********************************************");
		 
		 
		 //Problem 20 — Employee objects--Find and print the names of employees whose salary is greater than 60,000.
		 
		 List<Employee> employees = Arrays.asList(
				    new Employee(1, "Ravi", 50000),
				    new Employee(2, "Priya", 70000),
				    new Employee(3, "Arun", 45000),
				    new Employee(4, "Sneha", 80000),
				    new Employee(5, "Kiran", 60000)
				);
		 
		 employees.stream().filter(emp->emp.getSalary()>60000).map(emp->emp.getName()).forEach(emp->System.out.println(emp));
		 
		 System.out.println("*********************************************");
		 //Problem 21 — Employee + sorting
		 
		// Find all employees whose salary is greater than 40,000 and print their names in ascending order of salary.
		 
		 employees.stream().filter(empl->empl.getSalary()>40000).sorted((emp1,emp2)->Double.compare(emp1.getSalary() ,emp2.getSalary())).map(emp->emp.getName()).forEach(empl->System.out.println(empl));
		 
		 //problem-22 Print the names of all employees in descending order of salary.
		 System.out.println("*********************************************");
		 employees.stream().filter(emplo->emplo.getSalary()>40000).sorted((emplo1,emplo2)->Double.compare(emplo2.getSalary(),emplo1.getSalary())).map(emplo->emplo.getName()).forEach(emplo->System.out.println(emplo));
		 
		 System.out.println("*********************************************");
		 //Problem 23 — Highest-paid employee//Find the employee with the highest salary and print the employee's name.
		 
         String employeeesult =   employees.stream().sorted((employ1,employ2)->Double.compare(employ2.getSalary(),employ1.getSalary())).map(employ->employ.getName()).findFirst().get();
		 System.out.println(employeeesult);
		 
		 System.out.println("*********************************************");
		 //using max 
		 String highest = employees.stream().max((employe1,employe2)->Double.compare(employe1.getSalary(),employe2.getSalary())).get().getName();
		 System.out.println(highest);
		 
		 System.out.println("*********************************************");
		 
		 //Problem 24//Find the employee with the lowest salary and print the name.
		 //using min 
		 String lowest = employees.stream().min((employe1,employe2)->Double.compare(employe1.getSalary(),employe2.getSalary())).get().getName();
		 System.out.println(lowest);
		 
		 System.out.println("*********************************************");
		 
		 //problem25 //Find the employee with the highest salary and print the entire Employee object.
		 
		 Optional<Employee> empObj = employees.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));
		 System.out.println(empObj.get());
		 
		 System.out.println("*********************************************");
		 //Problem 26 //Find the employee with the lowest salary and print the entire Employee object.
		 
		 Optional<Employee> empObj1 = employees.stream().min((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));
		 System.out.println(empObj1.get());
		 
		 
		 System.out.println("*********************************************");
		 
		 //Problem 27 //Find the total salary of all employees and print it.
		 
		Double sumofsalaries =  employees.stream().map(emp-> emp.getSalary()).reduce(0.0,(a,b)-> (a+ b));
		 System.out.println(sumofsalaries);
		 
		 
		 System.out.println("*********************************************");
		 //problem-28 //Find the total salary of employees whose salary is greater than 50,000.
		 
		 Double sal = employees.stream().filter(emp->emp.getSalary()>50000).map(emp->emp.getSalary()).reduce(0.0,(a,b)->(a+b));
		 System.out.println(sal);
		 
		 System.out.println("*********************************************");
		 
		//Problem 29 //Find the average salary of all employees.
			Double avgsalary = employees.stream().mapToDouble(emp->emp.getSalary()).average().getAsDouble();
			System.out.println(avgsalary);
			
			
			 System.out.println("*********************************************");
			//Problem 30//Get the names of all employees and store them in a List<String> using Collectors.toList().
			
			List<String> StringList = employees.stream().map(emp->emp.getName()).collect(Collectors.toList());
			System.out.println(StringList);
			
			 System.out.println("*********************************************");
			
			//Problem 31 — Collectors.joining() //Get all employee names as a single String, separated by , (comma + space).
			String collectedString = employees.stream().map(emp->emp.getName()).collect(Collectors.joining(", "));
			System.out.println(collectedString);
			
			 System.out.println("*********************************************");
				
				//Problem 32 — Partition the employees into two groups based on salary Salary greater than 60,000 → true
			// Salary 60,000 or below → false
			 
			Map<Boolean,List<Employee>> empPart = employees.stream().collect(Collectors.partitioningBy(emp->emp.getSalary()>60000));
			System.out.println(empPart);
			
			
			 System.out.println("*********************************************");
			//problem33 - Group employees based on their salary using Collectors.groupingBy().
			
			Map<Double,List<Employee>> m = employees.stream().collect(Collectors.groupingBy(emp->emp.getSalary()));
			System.out.println(m);
			
			//problem 34 -Count how many employees have each salary.
			Map<Double, Long> collect = employees.stream().collect(Collectors.groupingBy(emp->emp.getSalary(),Collectors.counting()));
			System.out.println(collect);
			
			
	}
	
	
	

}
