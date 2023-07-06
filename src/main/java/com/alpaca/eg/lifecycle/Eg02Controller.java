package com.alpaca.eg.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Eg02Controller {
	
	@RequestMapping("/lifecycle/eg02")
	public String jspPage()
	{
		return "lifecycle/eg02";
	}
}
