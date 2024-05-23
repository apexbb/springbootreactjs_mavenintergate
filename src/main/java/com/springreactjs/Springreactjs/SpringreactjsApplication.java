package com.springreactjs.Springreactjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringreactjsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactjsApplication.class, args);
	}

	@GetMapping("/1")
	public String hello()
	{
		return "Hello";
	}
}
