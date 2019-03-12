package com.spring.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEndPoints {
	
	@GetMapping("/ejemplo")
	public String welcome() {
		return "Hola Soy Raul";
	}

}
