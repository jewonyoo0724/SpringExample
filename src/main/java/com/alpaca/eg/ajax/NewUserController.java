package com.alpaca.eg.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.eg.ajax.service.NewUserService;
import com.alpaca.eg.jsp.domain.User;

@Controller
@RequestMapping("/ajax/user")
public class NewUserController {

	@Autowired
	private NewUserService newUserService;
	
	@GetMapping("/list")
	public String userList(Model model)
	{
		List<User> userList = newUserService.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "/ajax/user/list";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> createUser(
			@RequestParam("name") String name,
			@RequestParam("birthday") String birthday,
			@RequestParam("email") String email,
			@RequestParam("introduce") String introduce)
	{
		int count = newUserService.addUser(name, birthday, email, introduce);
		
		// success or failure as object
		// success: {"result":"success"}
		// failure: {"result":"fail"}
		
		Map<String, String> resultMap = new HashMap<>();
		
		if (count == 1)
		{
			resultMap.put("result", "success");
		}
		else
		{
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}

	@GetMapping("/input")
	public String userInput()
	{
		return "ajax/user/input";
	}
	
	//API
	// get email -> if same email address exists, alert
	@GetMapping("/email-confirm")
	@ResponseBody
	public Map<String, Boolean> isDuplicateEmail(@RequestParam("email") String email) //Boolean is wrapper class
	{
		Map<String, Boolean> duplicateMap = new HashMap<>();
		
		if (newUserService.isDuplicateEmail(email))
		{
			//duplicate
			duplicateMap.put("isDuplicate", true);
		}
		else
		{
			//unique
			duplicateMap.put("isDuplicate", false);
		}
		
		return duplicateMap;
	}
}
