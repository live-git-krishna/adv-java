package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Configuration {
	@RequestMapping("/hello")
	public String heelo()

	{
		return "Hello World Springboot.";
	}

}
