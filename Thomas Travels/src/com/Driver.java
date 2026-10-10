package com;

public class Driver {
	
	int driverId ;
	String category;
	String driverName;
	double totalDistance;
	
	public int  getDriverId()
	{
		return this.driverId; 
	}
	
	public void setDriverId(int driverId)
	{
		this.driverId= driverId;
	}
	
	public String getCategory() 
	{
		return this.category;
	}
	
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	public String getDriverName() 
	{
		return this.driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName= driverName;
	}
	
	public double getTotalDistance()
	{
		return this.totalDistance;
	}
	
	public void setTotalDistance(double totalDistance)
	{
		this.totalDistance = totalDistance;
	}
	
	public Driver() {
		
	}
	
	public Driver(int driverId,String category,String driverName,double totalDistance) {
		this.driverId = driverId;
		this.category= category;
		this.driverName= driverName;
		this.totalDistance = totalDistance;
	}
	
	
	 @Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", category=" + category + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}
	
	

}
