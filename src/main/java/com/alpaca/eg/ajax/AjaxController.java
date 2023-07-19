package com.alpaca.eg.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@GetMapping("/test")
	public String ajaxTest()
	{
		return "ajax/ajax";
	}
	
	//person info in json as response
	@GetMapping("/person")
	@ResponseBody
	public Map<String, String> personInfo()
	{
		Map<String, String> personMap = new HashMap<>();
		personMap.put("name", "Harry");
		personMap.put("age", "21");
		
		return personMap;
	}
}
