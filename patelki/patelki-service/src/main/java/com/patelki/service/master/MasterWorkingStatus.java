package com.patelki.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.domain.TnMWorkingStatus;
import com.patelki.mapper.TnMWorkingStatusMapper;

@Service
@Component
public class MasterWorkingStatus {
	
	
	@Autowired
	private TnMWorkingStatusMapper tnMWorkingStatusMapper;
	
	
	/* get all working status */
	public List<TnMWorkingStatus> getAllWorkingStatus(){
		
		return tnMWorkingStatusMapper.selectByExample(null);
		
	}
	
	
	/* save working status */
	public void saveWorkingStatus(TnMWorkingStatus workingStatus) {
		
		tnMWorkingStatusMapper.insert(workingStatus);
		
	}
	
	
	/* edit working status */
	public void editWorkingStatus(TnMWorkingStatus workingStatus) {
		
		tnMWorkingStatusMapper.updateByPrimaryKey(workingStatus);
		
	}
	
	
	/* delete working status */
	public void deleteWorkingStatus(int id) {
		
		tnMWorkingStatusMapper.deleteByPrimaryKey(id);
		
	}
	
	
	/* get detail working status */
	public TnMWorkingStatus getDetailWorkingStatus(int id) {
		
		return tnMWorkingStatusMapper.selectByPrimaryKey(id);
		
	}

}
