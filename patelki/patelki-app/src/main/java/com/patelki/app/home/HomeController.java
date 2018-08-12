package com.patelki.app.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping(value="/")
	public String index(HttpServletRequest request, ModelMap map) {
		
		return "index";
		
	}
	
	
	@RequestMapping(value="/home/login")
	public String login(HttpServletRequest request, ModelMap map) {
		
		return "support/login";
		
	}
	
	
	@RequestMapping(value="/home/register")
	public String register(HttpServletRequest request, ModelMap map) {
		
		return "support/register";
		
	}
	
	
	@RequestMapping(value="/home/forgotpassword")
	public String forgotPassword(HttpServletRequest request, ModelMap map) {
		
		return "support/forgot_password";
		
	}
	
	
}
