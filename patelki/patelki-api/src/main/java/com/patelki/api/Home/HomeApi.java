package com.patelki.api.Home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patelki.domain.TnPUserLogin;
import com.patelki.service.home.HomeService;

@RestController
@RequestMapping(value = "/api/home/login")
public class HomeApi {
	
	
	@Autowired
	private HomeService homeService;
	
	
	
	@GetMapping("/")
	public String login() {
		
		return "Login Success";
		
	}
	

}
