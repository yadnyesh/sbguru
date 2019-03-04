package io.yadnyesh.sbguru.controller;

import io.yadnyesh.sbguru.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void printMessageOnCommandLine() {
		System.out.println("Hello World");
	}
	
}