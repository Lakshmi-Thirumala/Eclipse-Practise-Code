package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	
	public static void main(String... args) {
		
		//double the number in list
		List<Integer> nums = Arrays.asList(6,11,26,40,50);
		List<Integer> list = nums.stream().map(num-> num*2).toList();
		System.out.println(list);
		
		//given list of numbers ,add all by 4 and return top 2 elements in a list which are multiples of 5
		List<Integer> li = nums.stream().map(num->num+4).filter(num->num%5==0).sorted(Comparator.reverseOrder()).distinct().limit(2).toList();
		System.out.println(li);
		
//		List<Employee> list1 = new ArrayList<>();
//		list1.add(new Employee("Lakshmi",1,50000));
//		list1.add(new Employee("Samu",2,60000));
////		
//		List<String> list2 = list1.stream().map(num->num.getEmpName()).toList();
//		System.out.println(list2);
		
//		//increase salry by 2000 and get emp objects back
//		 list1.stream()
//		      .map(emp->new Employee (emp.getEmpName(),emp.getEmpId(),emp.getSalary() + 2000))
//			  .forEach(num->System.out.println(num));
//		 
//		 //return emp data whose value is startswith L
//		 list1.stream().filter(emp->emp.getEmpName().startsWith("L")).map(emp-> emp.getEmpName()).forEach(emp->System.out.println(emp));
//		 
//		 
		 Map<String,String> map = new HashMap<>();
		 map.put("Lakshmi", "Java");
		 map.put("Srilatha", "Java");
		 map.put("Samu", "medical");
		 map.put("mouni", "Home");
		 
		 //map.entrySet().stream().filter(emp->emp.getValue().equals("Java")).forEach(emp->System.out.println(emp));
		 
		 map.entrySet().stream().filter(emp->emp.getValue().equals("Java")).forEach(emp->System.out.println(emp.getKey() + ":" + emp.getValue()));
		 
		 
		 //need values without duplicates without using distinct 
		 
		 Set<String> str = map.entrySet().stream().map(emp-> emp.getValue()).collect(Collectors.toSet());
		 System.out.println(str);
		 
		 //keyset
		 
		 map.keySet().stream().forEach(key->System.out.println(key));
		 
		 //values 
		 map.values().stream().forEach(emp->System.out.println(emp));
		 
		 //collect data into map
		 
		Map<String,String>  map5 = map.entrySet().stream().filter(e-> e.getValue().equals("Java")).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		System.out.println(map5);
		
		
		//calculate sum of elements --sum wont work on wrapper type - sum work on int type
		
		List<Integer> lis =  Arrays.asList(10,20,40);
		
		int sum = lis.stream().mapToInt(n->n).sum();
		System.out.println(sum);
		
		int max = lis.stream().mapToInt(n->n).max().getAsInt();
		System.out.println(max);
		
		 int min = lis.stream().mapToInt(n->n).min().getAsInt();	
		 System.out.println(min);
		 
		 double avg = lis.stream().mapToInt(n->n).average().getAsDouble();
		 System.out.println(avg);
		 
		 //find the number of factors of 6 
		 
		 long count = lis.stream().filter(n-> n%6==0).count();
		 System.out.println(count);
		 
		 boolean match = lis.stream().mapToInt(n->n).anyMatch(n->n %8 ==0);
		 System.out.println(match);
		 
		 boolean allMatch = lis.stream().mapToInt(n->n).allMatch(n->n%8==0);
		 System.out.println(allMatch);
		 
		 boolean nonMatch = lis.stream().mapToInt(n->n).noneMatch(n->n%3==0);
		 System.out.println(nonMatch);
		 
		 //flatMap
		 List<List<String>> fm = Arrays.asList(List.of("apple","Ball"),List.of("Mango","Sitapal"));
		 List<String> flatmapdata = fm.stream().flatMap(m->m.stream()).toList();
		 System.out.println(flatmapdata);
		 
		 List<Integer> l = Arrays.asList(1,2,3,4,56,7,8);
		 
		Map<Boolean,List<Integer>> m=  l.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(m);
		 
		 
		 
		 Map<Boolean,List<Integer>> mp = l.stream().collect(Collectors.partitioningBy(n->n>25));
		 System.out.println(mp);
		 
		 //parallel stream
		 List<String> st = Arrays.asList("Lakshmi","samu","adi","Divya");
		 st.parallelStream().forEach(num->System.out.println(num));
		 
		 //reduce accpets binary operator 
		 //accept two values --initial value and lamda
		List<Integer> i = Arrays.asList(1,2,3,4,5,6,7);
		 int sum3 = i.stream().reduce(0,(a,b)->a+b);// a value will be o and b will be number from list like that it goes 
		 System.out.println(sum3);
		 
		 int mul = i.stream().reduce(1,(a,b)->a*b);
		 System.out.println(mul);
		 
		 List<String> s = Arrays.asList("FLM","Frontlines","edutech");
		 String sr = s.stream().reduce("",(a,b)->a+" " +b).trim();//initial it takes empty and space -so initali it get sspace to trim we use trim in strin
		 System.out.println(sr);
		 
		 
		 //Streams Continuation
		 
		 String name = "FrontlineEductech";
		 //name.chars().forEach(num->System.out.println(num));
//		 name.chars().mapToObj(n->(char)n).forEach(num->System.out.println(num));
		 List<Character> ch = name.chars().mapToObj(n->(char)n).toList();
		 System.out.println(ch);
		 
		 //remove duplicates 
		 String names = "FrontlineEductech";
		 List<Character> result = names.chars().mapToObj(c->(char)c).distinct().toList();
		 System.out.println(result);
		 
		 //Joining---- retrun string --so we use joining to join on strings----only work on strings
		 String names1 = "FrontlineEdutech";
		 String collect = names1.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		 System.out.println(collect);
		 
		 String names2 = "FrontlinesEduTech";
		 String collect2 = names2.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining(","));
		 System.out.println(collect2);
		 
		 String na = "Front lines media";
		String resu = na.chars().filter(c->c != ' ').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining("-"));
		System.out.println(resu);
		
		//overloaded method - joining-- apears as list but not list
		//[F,R,O,N,T]
		String  name3 = "Front";
		String re= name3.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining(",","[","]"));// first index ,last index
		System.out.println(re);
		
		//FRONT-LINES-MEDIA
		String si = "FRONT-LINES-MEDIA";
		String[] sti = si.split("-");
		String j = Arrays.stream(sti).collect(Collectors.joining(","));
		System.out.println(j);
		
		//"Java is very very difficult language"-- remove duplicate words with hypen separated
		
		String nas = "Java is very very difficult language";
		String a = Arrays.stream(nas.split(" ")).distinct().collect(Collectors.joining("-"));
		System.out.println(a);
		
		//for above example - just print first letters of each word 
		
		String h = "Java is a very very difficult language";
		String collect3 = Arrays.stream(h.split(" ")).distinct().map(sd->String.valueOf(sd.charAt(0))).collect(Collectors.joining());
		 System.out.println(collect3);
		 
		 
		 
		 
		 //groupingBy-- works on anything 
		 
		 //frequency of characters
		 
		 //based on particlar char or string we grp something
		 String f = "JAVA";
		Map<Character,Long> me =  f.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c ,Collectors.counting()));
		 System.out.println(me);
		 
		 //frequency of words
		 
		 String fq = "Fayaz sai Fayz Lakshmi Heman sai sai";
		 Map<String,Long> d = Arrays.stream(fq.split(" ")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
		 System.out.println(d);
		 
		 //grouping by 3 parameters//for sorted output
		 String  g = "FRONTLINES";
		Map<Character,Long> treemap =  g.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,()-> new TreeMap<>(),Collectors.counting()));
		 System.out.println(treemap);
		 
		//grouping by 3 parameters//maintain insertion order
		 String  gu = "FRONTLINES";
		Map<Character,Long> linkedHashmap =  gu.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,()-> new LinkedHashMap<>(),Collectors.counting()));
		 System.out.println(linkedHashmap);
		 
		 
		 //return all employees grouped by department
		 List<Employee> e = Arrays.asList(new Employee("Lakshmi",1,50000,new Department(1,"ECE")),
				                          new Employee("Fayaz",1,500000,new Department(2,"ECE")),
		                                  new Employee("Sri",1,70000,new Department(1,"ECE")),
		                                  new Employee("Divya",1,50000,new Department(2,"Mech")),
		                                  new Employee("Anju",1,50000,new Department(2,"Civil")),
		                                  new Employee("Ali",1,50000,new Department(2,"Civil")),
		                                  new Employee("Aden",1,50000,new Department(2,"ECE")),
		                                  new Employee("Anu",1,50000,new Department(2,"ECE")));
		 
		 Map<String,List<Employee>> grouped = e.stream().collect(Collectors.groupingBy(emp->emp.getDepartment().getDepartmentName()));
		 System.out.println(grouped);
		 
		 //iterate through above map
		 
		 grouped.entrySet().forEach(p-> System.out.println(p.getKey() + "=" + p.getValue()));
		 
		 //return the count of employees in each department
		 
		 Map<String, Long> collect4 = e.stream().collect(Collectors.groupingBy(o->o.getDepartment().getDepartmentName(),Collectors.counting()));
		 System.out.println(collect4);
		 
		 
		 //avg salary of each department
		 
		 Map<String, Double> collect5 = e.stream().collect(Collectors.groupingBy(c-> c.getDepartment().getDepartmentName(),Collectors.averagingDouble(c-> c.getSalary())));
		 System.out.println(collect5);
		 
		 //highest count in a department//this one is coded by me //validate this //homework problem
		 Map<String, Long> collect6 = e.stream().collect(Collectors.groupingBy(gh->gh.getDepartment().getDepartmentName(),Collectors.counting()));		 
		 System.out.println(collect6);
		Long long1 = collect6.entrySet().stream().map(r-> r.getValue()).sorted(Comparator.reverseOrder()).limit(1).findFirst().get();
		 System.out.println(long1);
		 
		 //the above they expected department name who have highets employes--what is approach
		 
		Map.Entry<String,Long> maxdept =  collect6.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 System.out.println("Department:" +maxdept.getKey() + " and Count:" + maxdept.getValue());
		 
		 
		 //Approach from copilot
		 Optional<Map.Entry<String, Long>> maxDept =
		    e.stream()
		     .collect(Collectors.groupingBy(
		         gh -> gh.getDepartment().getDepartmentName(),
		         Collectors.counting()
		     ))
		     .entrySet()
		     .stream()
		     .collect(Collectors.maxBy(Map.Entry.comparingByValue()));

		if (maxDept.isPresent()) {
		    System.out.println("Department:" + maxDept.get().getKey() +
		                       ", Count:" + maxDept.get().getValue());
		}

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}

}
