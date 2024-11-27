package myWeddingFlow.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
@Alias("reviewsDTO")
public class ReviewsDTO {
	String reviewId;
	String productId;
	String memberId;
	Integer rating;
	String reviewContents;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate reviewDate;
}
