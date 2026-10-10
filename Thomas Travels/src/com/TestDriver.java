package com;

public class TestDriver {
	
	public static void main(String args[])
	{
	
		Driver[] driver = new Driver[4];
		driver[0]= new Driver(1,"Auto","Bob",35);
		driver[1] = new Driver(2,"Car","Casy",124);
		driver[2] = new Driver(3,"Lorry","Dan",12);
		driver[3] = new Driver(4,"Auto","Eve",56);
		
		Travel travel  = new Travel();
		boolean categoryOfDriverCartravel = travel.isCarDriver(driver[0]);
		System.out.println(categoryOfDriverCartravel);
		
		String DriverDetails = travel.retriveByDriverId(driver,2);
		System.out.println(DriverDetails);
		
		int retriveCountOfDriver = travel.retriveCountOfDriver(driver,"Auto");
		System.out.println(retriveCountOfDriver);
		
		Driver[] resultDrivers = travel.retriveDriver(driver,"Auto");
		for(Driver drivers: resultDrivers) {
			System.out.println(drivers);
		}	
		
		Driver maxDistanceTravelledDriver = travel.maximumDistanceTravelledByDriver(driver);
		System.out.println(maxDistanceTravelledDriver);
	}

}
