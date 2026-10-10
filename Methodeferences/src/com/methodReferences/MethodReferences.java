package com.methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferences {
	
	public static void main(String[] args) {
		
		//using java 8 lamba expression
		List<String> names = Arrays.asList("Fayaz","Sriniketan","Lakshmi","Srilatha");
		names.stream().map(name-> name.toUpperCase()).forEach(n->System.out.println(n));
		
		System.out.println("*******************************************************");
		
		//same with method refrences
		names.stream().map(String::toUpperCase).forEach(n->System.out.println(n));//simplfying and making more readable
		
		//same with method refrences
		names.stream().map(String::toUpperCase).forEach(System.out::println);//simplfying and making more readable
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,56,7,8,23,27,29,31,33,36,50);
		numbers.stream().filter(MethodReferences::isPrime).forEach(System.out::println);
		
		String flaName = "FLM$%#&123EDUTECH";
//		flaName.chars().mapToObj(c->(char)c).filter(s->Character.isAlphabetic(s)).forEach(System.out::println);
		
		//using lamda expression
		String lam = flaName.chars().filter(Character::isAlphabetic).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(lam);
		
		
		List<Employee> lis = Arrays.asList(new Employee("Lakshmi",50000,new Department("ECE",001)),
                                           new Employee("Srini",100000,new Department("EEE",002)));
		
		lis.stream().map(emp-> emp.getDepartment().getDepartmentName()).forEach(System.out::println);
		
		//here we cannotly directl use method reference - i directly created direct departmentName in employee only
		lis.stream().map(Employee::getDepartmentName).forEach(System.out::println);
		
		//in lamalda specifically - object creation happening
		List<Student> listStudent = names.stream().map(n-> new Student(n)).toList();
		System.out.println(listStudent);
		
		//in lamalda specifically - object creation happening//works for one parameter
				List<Student> listStudent1 = names.stream().map(Student::new).toList();
				System.out.println(listStudent1);
	}
		//we using in place of lamba as there is only one method 
		
		public static boolean isPrime(int n){
			if(n<=1) {
				return false;
			}
				
			for(int i=2 ; i <= Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}}
			return true;
		}
		
		
	}

