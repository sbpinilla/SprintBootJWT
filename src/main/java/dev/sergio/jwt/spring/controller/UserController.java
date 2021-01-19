package dev.sergio.jwt.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/user")
public class UserController {

	@RequestMapping("list")
	public String helloWorld(@RequestParam(value="name", defaultValue="Sergio pinilla") String name) {
		return "Hello "+name+"!!";
	}
	
}

