package io.yadnyesh.sbguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbguruApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SbguruApplication.class, args);
//		MyController myController = (MyController) applicationContext.getBean("myController");
//		myController.printMessageOnCommandLine();
		
	}
	
}
