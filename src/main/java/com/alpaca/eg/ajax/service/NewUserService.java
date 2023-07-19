package com.alpaca.eg.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.eg.ajax.repository.NewUserRepository;
import com.alpaca.eg.jsp.domain.User;

@Service
public class NewUserService {

	@Autowired
	private NewUserRepository newUserRepository;
	
	public List<User> getUserList()
	{
		List<User> userList = newUserRepository.selectUserList();
		return userList;
	}
	
	public int addUser(String name, String birthday, String email, String introduce)
	{
		int count = newUserRepository.insertUser(name, birthday, email, introduce);
		return count;
	}
}
