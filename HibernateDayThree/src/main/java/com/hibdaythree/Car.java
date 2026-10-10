package com.hibdaythree;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "cars")
public class Car {
	
	
	@EmbeddedId
	private CarId carid;
	
	private String model;
	
	private String company ;
	
	private int price;
	
	public Car() {
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", model=" + model + ", company=" + company + ", price=" + price + "]";
	}
	

	public Car(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	


	public Car(CarId carid, String model, String company, int price) {
		super();
		this.carid = carid;
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public CarId getCarid() {
		return carid;
	}

	public void setCarid(CarId carid) {
		this.carid = carid;
	}
	
	

}
