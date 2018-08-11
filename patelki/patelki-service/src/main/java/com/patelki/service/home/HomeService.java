package com.patelki.service.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.map.TnPUserLoginMapper;

@Service
@Component
public class HomeService {
	
	
	@Autowired
	private TnPUserLoginMapper tnPUserLoginMapper;
	
	
	
	

}
