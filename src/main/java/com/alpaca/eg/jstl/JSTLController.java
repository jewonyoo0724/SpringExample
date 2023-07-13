package com.alpaca.eg.jstl;

import java.util.ArrayList;
import java.util.List;

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
		
		return "jstl/eg02";
	}
}
