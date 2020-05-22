package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		// read Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// get the bean from Spring container
		Coach theCoach = context.getBean("tennisCoach",  Coach.class);
		// Coach anotherCoach = context.getBean("skatingCoach", Coach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// System.out.println(anotherCoach.getDailyWorkout());
		
		
		// close the context
		context.close();
	}
}
