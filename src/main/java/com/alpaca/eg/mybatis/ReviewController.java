package com.alpaca.eg.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.eg.mybatis.domain.Review;
import com.alpaca.eg.mybatis.service.ReviewService;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	// retrieve review data where id = 3
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id)

	{
		Review review = reviewService.getReview(id);
		return review;
	}
	
	// insert new review
	@RequestMapping("/eg02")
	@ResponseBody
	public String createReview()
	{
		//4, combo pizza, harry, 4.5, lot of discount., 
		//int count = reviewService.addReview(4, "pizza", "harry", 4.5, "lot of discount");
		
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("soup");
		review.setUserName("james");
		review.setPoint(2.5);
		review.setReview("kinda mid");
		
		int count = reviewService.addReviewByObject(review);
		
		return count + " rows affected";
	}
	
}
