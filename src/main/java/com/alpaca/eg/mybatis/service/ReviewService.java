package com.alpaca.eg.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.eg.mybatis.domain.Review;
import com.alpaca.eg.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;

	//data where id = 3
	public Review getReview(int id)
	{
		Review review = reviewRepository.selectReview(id);
		return review;
	}
	
	//add review
	public int addReview(
			int storeId,
			String menu,
			String userName,
			double point,
			String review)
	{
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		
		return count;
	}
	
	// data sent as object
	public int addReviewByObject(Review review)
	{
		int count = reviewRepository.insertReviewByObject(review);
		return count;
	}
}
