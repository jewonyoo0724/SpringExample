package com.alpaca.eg.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.eg.database.domain.UsedGoods;
import com.alpaca.eg.database.service.UsedGoodsService;

// only handles request, response
@Controller
public class UsedGoodsController {

	@Autowired
	private UsedGoodsService usedGoodsService;
	
	// get used_goods
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList()
	{
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		return usedGoodsList;
	}
}
