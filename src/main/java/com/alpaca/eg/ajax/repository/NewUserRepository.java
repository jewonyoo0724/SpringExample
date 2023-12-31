package com.alpaca.eg.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.eg.jsp.domain.User;

@Repository
public interface NewUserRepository {

	public List<User> selectUserList();
	
	public int insertUser(
			@Param("name") String name, 
			@Param("birthday") String birthday, 
			@Param("email") String email, 
			@Param("introduce") String introduce);
	
	//how many emails retrieved
	public int selectCountEmail(@Param("email") String email);
}
