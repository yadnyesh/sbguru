package io.yadnyesh.sbguru.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		return "Injected via the constructor";
	}
}
