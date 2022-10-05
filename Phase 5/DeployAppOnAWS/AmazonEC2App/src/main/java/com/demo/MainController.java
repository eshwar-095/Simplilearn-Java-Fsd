package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.demo")
public class MainController {
	@GetMapping("/")
	public   String String(){
		return "Hi!Welcome to AWS Cloud";
	};

}
