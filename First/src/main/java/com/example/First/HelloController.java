package com.example.First;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class HelloController {

	@GetMapping("/rak")
	public String index() {
		return "Greetings from Spring Boot!1234.....Rakesh";
	}

	@GetMapping("/abhi")
	public String outputindex() {
		return "Greetings from Spring Boot!1234.....Abhishek";
	}

	
	@GetMapping("/op")
	public String outputindex2() {
		return "Greetings from Spring Boot!1234.....Op";
	}
}