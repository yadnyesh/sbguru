package io.yadnyesh.sbguru.controller;

import io.yadnyesh.sbguru.service.GreetingService;

public class ConstructorInjectedController {
	public GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
