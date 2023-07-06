package com.alpaca.eg.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.alpaca.eg.database.domain.UsedGoods;

//uses Mybatis Framework
// handles database queries
@Repository
public interface UsedGoodsRepository {
	
	// used_goods table data retrieve & return
	
	public List<UsedGoods> selectUsedGoodsList();
}
