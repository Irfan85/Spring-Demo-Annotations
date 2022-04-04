package com.example.springdemo;

public class CautionFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Be aware of your surroundings.";
	}

}
