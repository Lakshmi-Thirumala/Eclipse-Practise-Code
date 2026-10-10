package com.clone;

public class Address {
	
	private String city;
	private double pinCode;
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public double getPincode() {
		return this.pinCode;
	}
	
	public Address() {
		
	}

	
	public Address(String city,double pincode) {
		this.city = city;
		this.pinCode = pincode;
	}
	
	
	public String toString() {
		return "[Address(City = " + this.city +"," + "pinCode = "+ this.pinCode +")]";
		
	}
}
