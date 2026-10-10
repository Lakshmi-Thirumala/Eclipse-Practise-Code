package com.hibdaythree;

import jakarta.persistence.Embeddable;

@Embeddable
public class CarId {
	
	
	private int modelNumber;
	
	private int engineNumber;

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public CarId() {
		
	}

	public CarId(int modelNumber, int engineNumber) {
		super();
		this.modelNumber = modelNumber;
		this.engineNumber = engineNumber;
	}

	@Override
	public String toString() {
		return "CarId [modelNumber=" + modelNumber + ", engineNumber=" + engineNumber + "]";
	}
	
	

}
