package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SkatingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise camel and sit spin for an hour.";
	}

}
