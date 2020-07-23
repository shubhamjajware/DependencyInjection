package com.demo.dependencyinjection;

public class BaseballCoach implements Coach{

	private Service service;
	
	public BaseballCoach(Service myservice) {
		service=myservice;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Batting for 15 mins.";
	}

	@Override
	public String getDailyService() {
		return service.getService();
	}

}
