package com.methodReferences;

public class Department {
	
	String departmentName ;
	double deparmentCode;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public double getDeparmentCode() {
		return deparmentCode;
	}
	public void setDeparmentCode(double deparmentCode) {
		this.deparmentCode = deparmentCode;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", deparmentCode=" + deparmentCode + "]";
	}
	public Department(String departmentName, double deparmentCode) {
		super();
		this.departmentName = departmentName;
		this.deparmentCode = deparmentCode;
	}
	public Department() {
		super();
	}
	
	

}
