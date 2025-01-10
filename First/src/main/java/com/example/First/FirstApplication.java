package com.example.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(FirstApplication.class, args);
		
		User u1 = context.getBean(User.class);
		System.out.println(u1.greet());
		
		User u2 = context.getBean(User.class);
		System.out.println(u2.greet());
		
	}

}
