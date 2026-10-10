package com.streams;

public class Employee {
	
	private String empName;
	private int empId;
	private double salary;
	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(String empName,int empId, double salary,Department department) {
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.department = department;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmpName() {
		return this.empName;
	}
	
	public void setEmpName(String empName) {
		this.empName= empName;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", department=" + department
				+ "]";
	}

}
