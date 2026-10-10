package com.comparator;

public class Student {
	
	private int id ;
	private String name;
	private String city;
	
	public int getId() {
		return this.id;	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(int id,String name,String city) {
		this.id = id;
		this.name= name;
		this.city = city;
	}
	
	public String toString(){
		return " [Student("  + this.id  + "," +  this.name + "," + this.city + ")]";
		
	}
	

}
