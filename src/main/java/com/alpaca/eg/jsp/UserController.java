package com.alpaca.eg.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.eg.jsp.domain.User;
import com.alpaca.eg.jsp.service.UserService;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	// get name, birthday, email, introduction & save data
//	@RequestMapping(path="/jsp/user/add", method=RequestMethod.POST)
	@PostMapping("/add")
	@ResponseBody
	public String createUser(
			@RequestParam("name") String name, 
			@RequestParam("birthday") String birthday, 
			@RequestParam("email") String email, 
			@RequestParam("intro") String intro)
	{
		
		int count = userService.addUser(name, birthday, email, intro);
		return count + " rows affected";
	}
	
	//method to show userinput page
	@GetMapping("/input")
	public String userInput()
	{
		return "jsp/userinput"; //rest of location is already written in application.properties
	}
	
	// get most recent user data
	@GetMapping("/last")
	public String lastUser(Model model)
	{
		User user = userService.getLastUser();
		
		model.addAttribute("result", user);
		
		return "jsp/userinfo";
	}
}
