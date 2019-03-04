package io.yadnyesh.sbguru.controller;

import io.yadnyesh.sbguru.service.GreetingServiceImpl;

public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

}
