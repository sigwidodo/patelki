package com.patelki.service.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.patelki.domain.TnMCard;
import com.patelki.mapper.TnMCardMapper;

@Service
@Component
public class MasterCardService {
	
	
	@Autowired
	private TnMCardMapper tnMCardMapper;
	
	
	/* get all card */
	public List<TnMCard> getAllCard(){
		
		return tnMCardMapper.selectByExample(null);
		
	}
	
	
	/* save card */
	public void saveCard(TnMCard card) {
		
		tnMCardMapper.insert(card);
		
	}
	
	
	/* edit card */
	public void editCard(TnMCard card) {
		
		tnMCardMapper.updateByPrimaryKey(card);
		
	}
	
	
	/* delete card */
	public void deleteCard(int id) {
		
		tnMCardMapper.deleteByPrimaryKey(id);
		
	}
	
	
	/* get detail card */
	public TnMCard getDetailCard(int id) {
		
		return tnMCardMapper.selectByPrimaryKey(id);
		
	}

	
}
