package myWeddingFlow.command;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class ReviewsCommand {
	String reviewId;
	String productId;
	String memberId;
	Integer rating;
	String reviewContents;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate reviewDate;
}
