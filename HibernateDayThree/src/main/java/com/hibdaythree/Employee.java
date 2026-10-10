package com.hibdaythree;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
@NamedQueries({@NamedQuery(name="allemployees",query = "From Employee"),@NamedQuery(name="singleemployee",query = "From Employee where employeeid=?1")})
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int employeeid;
	
	@Column(name="empName")
	private String  employeeName;
	
	@Column(name="salary")
	private int employeeSalary;
	
	public Employee() {
		
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Employee(int employeeid, String employeeName, int employeeSalary) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public Employee(String employeeName, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	

}
