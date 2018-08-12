package com.patelki.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.domain.TnMReligion;
import com.patelki.mapper.TnMReligionMapper;

@Service
@Component
public class MasterReligionService {
	
	
	@Autowired
	private TnMReligionMapper tnMReligionMapper;
	
	
	/* get all religion */
	public List<TnMReligion> getAllReligion(){
		
		return tnMReligionMapper.selectByExample(null);
		
	}
	
	
	/* save religion */
	public void saveReligion(TnMReligion religion) {
		
		tnMReligionMapper.insert(religion);
		
	}
	
	
	/* edit religion */
	public void editReligion(TnMReligion religion) {
		
		tnMReligionMapper.updateByPrimaryKey(religion);
		
	}
	
	
	/* get detail religion */
	public TnMReligion getDetailReligion(int id) {
		
		return tnMReligionMapper.selectByPrimaryKey(id);
		
	}
	
	
	/* delete religion */
	public void deleteReligion(int id) {
		
		tnMReligionMapper.deleteByPrimaryKey(id);
		
	}
	

}
