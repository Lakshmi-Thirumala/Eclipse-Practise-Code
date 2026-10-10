package com;

public class Travel {
	
	//Driver driver;
	
	public boolean isCarDriver(Driver driver){
	  if("Car".equals(driver.getCategory()))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
		
	}
	
	public String retriveByDriverId(Driver[] driver,int driverId) {
		Driver[] res = new Driver[5];
		for(int i = 0 ;i< 4 ;i++) {
			if(driverId == driver[i].driverId) {
				res[0]  = driver[i];
				break;
			}
		}
		return  "Driver name  is " + res[0].getDriverName() + " Belonging to the category " + res[0].getCategory() + " travelled " + res[0].getTotalDistance() + " KM so far";
			
	}
	
	public int retriveCountOfDriver(Driver[] driver, String category) {
		int count=0;
		for( int i=0;i<4;i++) {
			if(category.equalsIgnoreCase(driver[i].getCategory())) {
				count++;
			}
			}
		
		return count ;
	}
	
	public Driver[] retriveDriver(Driver[] driver,String category ) {
		Driver[] driv = new Driver[4];
		int j = 0;
		for(int i=0; i<driver.length;i++) {
			if(category.equals(driver[i].getCategory())){
				 driv[j] = driver[i];
				 j++;
			}
		}
		return driv  ;
		
	}
	
	public Driver maximumDistanceTravelledByDriver(Driver[] driver) {
		double maxDistance = driver[0].getTotalDistance();
		Driver maxDistanceTravelledDriver = new Driver();
		for(int i=1;i<4;i++) 
		{
			if(driver[i].getTotalDistance()> maxDistance) {	
			maxDistance = driver[i].getTotalDistance();
		}
								
		}
		for(int i = 0 ;i<4 ;i++) {
			if(maxDistance == driver[i].getTotalDistance())
				maxDistanceTravelledDriver =  driver[i];
		}
		return maxDistanceTravelledDriver; 
		
	}

}
