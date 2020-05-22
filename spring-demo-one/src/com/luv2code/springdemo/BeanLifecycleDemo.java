package com.luv2code.springdemo;

import javax.sound.midi.Soundbank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());		
		context.close();
	}
	

}
