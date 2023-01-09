package com.cts.project2.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		//another way to add properties if application.properties is not working
		/*SpringApplication app = new SpringApplication(Demo3Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		app.run(args);*/
	}
	
	
}
