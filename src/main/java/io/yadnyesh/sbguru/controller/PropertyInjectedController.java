package io.yadnyesh.sbguru.controller;

import io.yadnyesh.sbguru.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;

public class PropertyInjectedController {
	
	@Qualifier("getterGreetingService")
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

}
