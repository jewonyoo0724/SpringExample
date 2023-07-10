package com.alpaca.eg.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.eg.mybatis.domain.Review;

@Repository
public interface ReviewRepository {

	// retrieve data where id = 3
	public Review selectReview(@Param("id") int id);
	
	//get data, then insert
	public int insertReview(
			@Param("storeId") int storeId,
			@Param("menu")String menu,
			@Param("userName")String userName,
			@Param("point") double point,
			@Param("review")String review);
	
	public int insertReviewByObject(Review review);
}

