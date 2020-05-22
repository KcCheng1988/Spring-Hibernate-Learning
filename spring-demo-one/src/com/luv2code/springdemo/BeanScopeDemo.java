package com.luv2code.springdemo;

import javax.sound.midi.Soundbank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\n Pointing to the same result: " + result);
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}
	

}
