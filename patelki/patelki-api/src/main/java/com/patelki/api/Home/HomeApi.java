package com.patelki.api.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/home/login")
public class HomeApi {
	
	
	@GetMapping("/")
	public String login() {
		
		return "Login Success";
		
	}

}
