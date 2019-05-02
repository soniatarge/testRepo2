package com.bee.SpringFramework.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		System.out.println("I am in Hi");
		return "Hi Sonia";
		
	}

}
