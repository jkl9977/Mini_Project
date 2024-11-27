package myWeddingFlow.service.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.reviews.ReviewsMapper;

@Service
public class ReviewsDeleteService {
	@Autowired
	ReviewsMapper reviewsMapper;
	public void execute(String reviewId) {
		reviewsMapper.reviewsDelete(reviewId);
		
	}

}
