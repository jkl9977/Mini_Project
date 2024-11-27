package myWeddingFlow.service.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.ReviewsCommand;
import myWeddingFlow.domain.ReviewsDTO;
import myWeddingFlow.mapper.reviews.ReviewsMapper;

@Service
public class ReviewsWriteService {
	@Autowired
	ReviewsMapper reviewsMapper;
	public void execute(ReviewsCommand reviewsCommand) {
		ReviewsDTO dto = new ReviewsDTO();
		dto.setReviewId(reviewsCommand.getReviewId());
		dto.setProductId(reviewsCommand.getProductId());
		dto.setMemberId(reviewsCommand.getMemberId());
		dto.setRating(reviewsCommand.getRating());
		dto.setReviewContents(reviewsCommand.getReviewContents());
		dto.setReviewDate(reviewsCommand.getReviewDate());
		reviewsMapper.reviewsInsert(dto);
	}

}
