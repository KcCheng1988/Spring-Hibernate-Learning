package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K" ;
	}

	@Override
	public String getDailyFortune() {
		return "Nice weather: " + fortuneService.getFortune();
	}
	
	// add an init method executed at start of bean life cycle
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside doMyStartUpStuff");
	}
	
	// add destroy method executed at the end of bean life cycle
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside doMyDestroyStuff");
	}

}
