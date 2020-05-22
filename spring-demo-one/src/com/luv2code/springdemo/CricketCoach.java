package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	// out getter method
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter setFortunateService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	

}
