package com.ibm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	@GetMapping("/hello")  //"/"means no path
String hello() {
	return "hello";
}
}
