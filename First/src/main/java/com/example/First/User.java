package com.example.First;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
	private int id;
	private String name;
	
	public String greet() {
		return "Greeting from Spring 123456";
	}

	public User() {
		super();
		System.out.println("Obj Created");
	}
	
	

}
