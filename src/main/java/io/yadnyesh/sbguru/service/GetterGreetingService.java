package io.yadnyesh.sbguru.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		return "Injected by Getter";
	}
	
}
