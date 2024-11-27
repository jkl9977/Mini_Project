package myWeddingFlow.service.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ReviewsDTO;
import myWeddingFlow.mapper.reviews.ReviewsMapper;

@Service
public class ReviewsDetailService {
	@Autowired
	ReviewsMapper reviewsMapper;
	public void execute(String reviewId, Model model) {
		ReviewsDTO dto = reviewsMapper.reviewsSelectOne(reviewId);
		model.addAttribute("dto", dto);
	}
	
}
