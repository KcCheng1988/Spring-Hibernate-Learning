package com.luv2code.springdemo;

public class EnergeticFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hooray! Let's try your best today!";
	}
}
