package com.methodReferences;

public class Employee {
	
	String EmpName;
	double EmpSalary;
	
	Department department;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public String getDepartmentName() {
		return department.getDepartmentName();
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", department=" + department + "]";
	}

	public Employee(String empName, double empSalary, Department department) {
		super();
		EmpName = empName;
		EmpSalary = empSalary;
		this.department = department;
	}

	public Employee() {
		super();
	}
	

}
