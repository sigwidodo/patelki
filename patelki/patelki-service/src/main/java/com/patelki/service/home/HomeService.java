package com.patelki.service.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.domain.TnPUserLogin;
import com.patelki.mapper.TnPUserLoginMapper;

@Service
@Component
public class HomeService {
	
	
	@Autowired
	private TnPUserLoginMapper tnPUserLoginMapper;
	
	
	/* get all user login */
	public List<TnPUserLogin> getAllUserLogin() {
		
		return tnPUserLoginMapper.selectByExample(null);
		
	}
	
	
	/* insert user login */
	public void saveUserLogin(TnPUserLogin userLogin) {
		
		tnPUserLoginMapper.insert(userLogin);
		
	}
	
	
	/* update user login */
	public void editUserLogin(TnPUserLogin userLogin) {
		
		tnPUserLoginMapper.updateByPrimaryKey(userLogin);
		
	}
	
	
	/* delete user login */
	public void deleteUserLogin(int id) {
		
		tnPUserLoginMapper.deleteByPrimaryKey(id);
		
	}
	
	
	/* get detail user login */
	public TnPUserLogin getDetailUserLogin(int id) {
		
		return tnPUserLoginMapper.selectByPrimaryKey(id);
		
	}
	

}
