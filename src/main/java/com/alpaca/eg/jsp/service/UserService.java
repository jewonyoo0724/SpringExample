package com.alpaca.eg.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.eg.jsp.domain.User;
import com.alpaca.eg.jsp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// get data & save
	public int addUser(String name, String birthday, String email, String intro)
	{
		int count = userRepository.insertUser(name, birthday, email, intro);
		return count;
	}
	
	public int addUserByObject(User user)
	{
		int count = userRepository.insertUserByObject(user);
		return count;
	}
	
	// get last user
	public User getLastUser()
	{
		User user = userRepository.selectLastUser();
		return user;
	}

}
