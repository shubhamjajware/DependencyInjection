package com.demo.dependencyinjection;

public class CricketCoach implements Coach {
	
	private Service service;
	private String emailAddress;
	private String team;
	private String owner;
	private int networth;
	
	public CricketCoach() {
		System.out.println("inside no-arg constructor");
		
	}
	


	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		System.out.println("Inside set owner");
		this.owner = owner;
	}



	public int getNetworth() {
		return networth;
	}



	public void setNetworth(int networth) {
		this.networth = networth;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("inside set-email address");
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		System.out.println("Inside set-Team");
		this.team = team;
	}



	public void setService(Service service) {
		System.out.println("inside setter methods");
		this.service = service;
	}



	@Override
	public String getDailyWorkout() {
		return "Play Cricket for 30 mins.";
	}

	@Override
	public String getDailyService() {
		return service.getService();
	}

}
