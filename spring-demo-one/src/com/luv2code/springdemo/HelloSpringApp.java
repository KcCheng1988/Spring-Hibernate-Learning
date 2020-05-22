package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container 
		Coach theCoach1 = context.getBean("trackCoach", Coach.class);
		Coach theCoach2 = context.getBean("baseballCoach", Coach.class);
		Coach theCoach3 = context.getBean("rugbyCoach", Coach.class);
		CricketCoach theCoach4 = (CricketCoach) context.getBean("cricketCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		
		System.out.println(theCoach3.getDailyWorkout());
		System.out.println(theCoach3.getDailyFortune());
		
		System.out.println(theCoach4.getDailyWorkout());
		System.out.println(theCoach4.getDailyFortune());
		System.out.println("Email address: " + theCoach4.getEmailAddress());
		System.out.println("Team: "  + theCoach4.getTeam());
		// close the configuration file
		context.close();
	}

}
