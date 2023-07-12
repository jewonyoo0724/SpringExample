package com.alpaca.eg.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.eg.jsp.domain.User;

@Repository
public interface UserRepository {
	
	//get data & insert
	public int insertUser(
			@Param("name") String name,
			@Param("birthday") String birthday,
			@Param("email") String email, 
			@Param("intro") String intro);
	
	public int insertUserByObject(User user);
	
	// retrive last user data
	public User selectLastUser();

}
