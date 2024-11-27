package myWeddingFlow.service.reviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ReviewsDTO;
import myWeddingFlow.mapper.reviews.ReviewsMapper;

@Service
public class ReviewsListService {
	@Autowired
	ReviewsMapper reviewsMapper;
	public void execute(Model model) {
		List<ReviewsDTO> list = reviewsMapper.reviewsSelectAll();
		model.addAttribute("list", list);
		
	}
	
}
