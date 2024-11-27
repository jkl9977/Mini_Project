package myWeddingFlow.command;



import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ProductsCommand {
	String productId;
	String vendorNum;
	String productType;
	String productName;
	String productContents;
	String productMainImage;
	Integer productPrice;
	String penaltyCondition;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate availableDates;
	String contractTerms;
	String availability;
}
