package myWeddingFlow.mapper.reviews;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.ReviewsDTO;

@Mapper
public interface ReviewsMapper {

	public void reviewsInsert(ReviewsDTO dto);
	public List<ReviewsDTO> reviewsSelectAll();
	public ReviewsDTO reviewsSelectOne(String reviewId);
	public void reviewsUpdate(ReviewsDTO dto);
	public void reviewsDelete(String reviewId);
}
