package com.demo.dependencyinjection;

public class DemoApp {

	public static void main(String[] args) {
		Coach theCoach=new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());

	}

}
