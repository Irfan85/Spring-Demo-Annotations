package com.example.springdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{
	
	private ArrayList<String> fortunes;
	private Random random;
	
	public DatabaseFortuneService() {
		fortunes = new ArrayList<String>();
		random = new Random();
		
		try {
			Path filePath = Paths.get("src/fortunes.txt");
//			System.out.println(filePath.toAbsolutePath());
			
			BufferedReader br = Files.newBufferedReader(filePath);
			
			String line;
			
			while((line = br.readLine()) != null) {
				fortunes.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}
