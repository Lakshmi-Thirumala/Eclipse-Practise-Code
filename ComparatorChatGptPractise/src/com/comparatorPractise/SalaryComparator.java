package com.comparatorPractise;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	
	public int compare(Employee emp1 ,Employee emp2) {
		return Double.compare(emp1.getSalary(),emp2.getSalary());
	}
	
//	public int compare(Employee emp1 ,Employee emp2) {
//		return Double.compare(emp2.getSalary(),emp1.getSalary());
//	}

}
