package com.example.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private static final String[] FORTUNES = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};

	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(FORTUNES.length);
		
		return FORTUNES[index];
	}

}
