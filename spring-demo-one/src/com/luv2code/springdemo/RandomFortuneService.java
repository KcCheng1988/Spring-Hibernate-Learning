package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortuneArray = {"You are going to rock today!",
				"Day is getting bad today. But cheer up still!",
				"It's going to be very peaceful today!"
		};
		
		Random rand = new Random();
		int n = rand.nextInt(3);
		
		return fortuneArray[n];
	}

}
