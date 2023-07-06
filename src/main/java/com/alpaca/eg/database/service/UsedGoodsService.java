package com.alpaca.eg.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.eg.database.domain.UsedGoods;
import com.alpaca.eg.database.repository.UsedGoodsRepository;

// handles logic (business)
@Service
public class UsedGoodsService {

	
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	// retrieve used_goods list 
	public List<UsedGoods> getUsedGoodsList()
	{
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		
		return usedGoodsList;
	}
}
