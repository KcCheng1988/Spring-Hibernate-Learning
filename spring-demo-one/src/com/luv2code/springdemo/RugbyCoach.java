package com.luv2code.springdemo;

public class RugbyCoach implements Coach {
	
	private FortuneService fortuneService;

	public RugbyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Bench press 220 lbs 3 x 8";
	}

	@Override
	public String getDailyFortune() {
		return "A bit rainy today: " + fortuneService.getFortune();
	}
}
