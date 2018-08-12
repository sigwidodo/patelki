package com.patelki.app.master;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterReligionController {

	
	
	@RequestMapping(value="/master/religion")
	public String index(HttpServletRequest request, ModelMap map) {
		
		return "master/master_religion";
		
	}
}
