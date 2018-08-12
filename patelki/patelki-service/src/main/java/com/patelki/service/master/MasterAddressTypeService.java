package com.patelki.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.domain.TnMAddressType;
import com.patelki.domain.TnMAddressTypeExample;
import com.patelki.mapper.TnMAddressTypeMapper;


@Service
@Component
public class MasterAddressTypeService {

	
	@Autowired
	private TnMAddressTypeMapper tnMAddressTypeMapper;
	
	
	/* get all address type */
	public List<TnMAddressType> getAllAddressType(){
		
		return tnMAddressTypeMapper.selectByExample(null);
		
	}
	
	
	/* save address type */
	public void saveAddressType(TnMAddressType addressType) {
		
		tnMAddressTypeMapper.insert(addressType);
		
	}
	
	
	/* edit address type */
	public void editAddressType(TnMAddressType addressType) {
		
		tnMAddressTypeMapper.updateByPrimaryKey(addressType);
		
	}
	
	
	/* delete address type */
	public void deleteAddressType(int id) {
		
		tnMAddressTypeMapper.deleteByPrimaryKey(id);
		
	}
	
	
	/* get detail address type */
	public TnMAddressType getDetailAddressType(int id) {
		
		return tnMAddressTypeMapper.selectByPrimaryKey(id);
		
	}
	
	
}
