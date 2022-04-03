package com.example.springdemo;

import org.springframework.stereotype.Component;

// We to register this class as a component if we want spring to do automatic dependency injection using it
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
