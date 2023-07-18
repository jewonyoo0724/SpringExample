package com.alpaca.eg.jstl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTLController {

	@GetMapping("/eg01")
	public String eg01()
	{
		return "jstl/eg01";
	}
	
	@GetMapping("/eg02")
	public String eg02(Model model)
	{
		List<String> fruitList = new ArrayList<>();
		fruitList.add("peach");
		fruitList.add("banana");
		fruitList.add("melon");
		fruitList.add("dragonfruit");
		
		model.addAttribute("fruitList", fruitList);
		
		// user info list
		// name, age, hobby
		
		List<Map<String, Object>> userList = new ArrayList<>();
		
		Map<String, Object> user1 = new HashMap<>();
		user1.put("name", "Harry");
		user1.put("age", 20);
		user1.put("hobby", "reading");
		
		userList.add(user1);
		
		Map<String, Object> user2 = new HashMap<>();
		user2.put("name", "James");
		user2.put("age", 21);
		user2.put("hobby", "gaming");
		
		userList.add(user2);
		
		model.addAttribute("userList", userList);
		
		
		return "jstl/eg02";
	}
	
	@GetMapping("/eg03")
	public String eg03(Model model)
	{
		Date date = new Date();
		model.addAttribute("now", date);
		
		String dateString = "2023/07/14 20:53:12";
		model.addAttribute("dateString",dateString);
		return "jstl/eg03";
	}
}
