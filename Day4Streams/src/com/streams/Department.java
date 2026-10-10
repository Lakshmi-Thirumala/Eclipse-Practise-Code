package com.streams;

public class Department {
	
	int dept_id;
	String deptName;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(int dept_id, String deptName) {
		super();
		this.dept_id = dept_id;
		this.deptName = deptName;
	}
	
	public Department() {
		
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", deptName=" + deptName + "]";
	}
	
	

}
