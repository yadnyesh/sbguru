package io.yadnyesh.sbguru.controller;

import io.yadnyesh.sbguru.service.GreetingService;

public class SetterInjectedController {
	public GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
