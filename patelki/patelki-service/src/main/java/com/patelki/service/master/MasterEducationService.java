package com.patelki.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.domain.TnMEducation;
import com.patelki.mapper.TnMEducationMapper;

@Service
@Component
public class MasterEducationService {
	
	
	@Autowired
	private TnMEducationMapper tnMEducationMapper;
	
	
	
	/* get all education */
	public List<TnMEducation> getAllEducation(){
		
		return tnMEducationMapper.selectByExample(null);
		
	}
	
	
	/* save education */
	public void saveEducation(TnMEducation education) {
		
		tnMEducationMapper.insert(education);
		
	}
	
	
	/* edit education */
	public void editEducation(TnMEducation education) {
		
		tnMEducationMapper.updateByPrimaryKey(education);
		
	}
	
	
	/* delete education */
	public void deleteEducation(int id) {
		
		tnMEducationMapper.deleteByPrimaryKey(id);
		
	}
	
	
	/* get detail education */
	public TnMEducation getDetailEducation(int id) {
		
		return tnMEducationMapper.selectByPrimaryKey(id);
		
	}
	
	
}
