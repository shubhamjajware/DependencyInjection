package com.demo.dependencyinjection;

public class TrackCoach implements Coach{
	private Service service;

	public TrackCoach() {
		
	}
	public TrackCoach(Service myservice) {
		service = myservice;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Run for 30 minutes";
	}

	@Override
	public String getDailyService() {
		
		return service.getService();
	}
	
	

}
