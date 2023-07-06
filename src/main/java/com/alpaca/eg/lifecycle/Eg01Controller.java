package com.alpaca.eg.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Eg01Controller {
	
	@RequestMapping("/lifecycle/eg01/1")
	@ResponseBody
	public String stringResponse() //return type = string -> automatically, content type = text/html (Http response converter)
	{
		return "<h1>e.g. 1 string</h1>";
	}
	
	//return map
	 @RequestMapping("/lifecycle/eg01/2")
	 @ResponseBody
	public Map<String, Integer> mapResponse()
	{	
		 // map -> fruit : price
		 Map<String, Integer> fruitMap = new HashMap<>();
		 fruitMap.put("apple", 1);
		 fruitMap.put("banana", 2);
		 fruitMap.put("melon", 4);
		
		 return fruitMap;
	}
}
