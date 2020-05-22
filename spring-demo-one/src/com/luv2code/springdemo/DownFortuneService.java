package com.luv2code.springdemo;

public class DownFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "A bit down today, try your best nevertheless :) ";
	}

}
