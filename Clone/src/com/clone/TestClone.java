package com.clone;

import java.util.ArrayList;
import java.util.List;

public class TestClone {
	
	public static void main(String... args) throws CloneNotSupportedException {
		
		List<Employee> EmpList = new ArrayList<>();
		
		Employee emp1 = new Employee(1,"lakshmi","CTS",new Address("Gudivada",521148));
		EmpList.add(emp1);
		System.out.println("Emp1 details :"+emp1);
		
		Employee emp2 = (Employee) emp1.clone();
		Employee emp3= emp1;
//		emp2.setempId(3);
//		emp2.setComapanyName("Deloitte");
//		emp2.getAddress().setCity("Hyderabad");
		System.out.println("Emp2 Details : " + emp3);
//		System.out.println("Emp Details after clone:"+emp1);
		System.out.println(emp3);
		emp3.getAddress().setCity("Guntur");
		System.out.println(emp3);
		System.out.println(emp1);
		
	}

}
