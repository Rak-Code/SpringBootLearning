package com.example.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = {"Controller"})
public class FirstApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(FirstApplication.class, args);
		
//		User u1 = context.getBean(User.class);
//		System.out.println(u1.greet());
//		
//		User u2 = context.getBean(User.class);
//		System.out.println(u2.greet());
//		
//		Post p1 = context.getBean(Post.class);
////		p1.setUser(u2);
////		System.out.println(p1.getUser().greet());
//		System.out.println(p1.getUser().greet());
		
	}
	
//	@Autowired
//	Post p2;
//	@PostConstruct
//	public void init() {
//		System.out.println(p2.getUser().greet());
//	}

}
