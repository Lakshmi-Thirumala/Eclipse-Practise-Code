package com.clone;

public class Employee implements Cloneable {
	
	private int empId;
	private String EmpName;
	private String CompanyName;
	private Address address;
	
	public int getInt() {
		return this.empId;
	}
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return this.EmpName;
	}
	
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	
	public String getComapanyName() {
		return this.CompanyName;
	}
	
	public void setComapanyName(String CompanyName) {
		this.CompanyName = CompanyName;
		
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(int Empid,String EmpName,String CompanyName,Address address) {
		this.empId= Empid;
		this.EmpName=EmpName;
		this.CompanyName = CompanyName;
		this.address= address;
	}
	
	//for Deep copy
	public Employee(Employee Emp) {
		this.empId= Emp.empId;
		this.EmpName= Emp.EmpName;
		this.CompanyName = Emp.CompanyName;
		this.address= new Address(Emp.getAddress().getCity(),Emp.getAddress().getPincode());
	}
	
	public String toString() {
		return  "[Employee(EmpId = " +  this.empId + "," + "EmpName = " + this.EmpName + "," + "CompanyName= " + this.CompanyName + ","+ "Address= " + this.address+ ")]";
	}
	
//	//Shallow Copy
//	public Object clone() throws CloneNotSupportedException{
//		    	return super.clone();
//		    }
	
	
	
	//Deep Copy
	 public Object clone() throws CloneNotSupportedException{
	    	return new Employee(this);
	    }
	    

}
