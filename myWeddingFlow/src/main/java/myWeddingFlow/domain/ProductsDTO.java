package myWeddingFlow.domain;



import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Alias("productsDTO")
@Data
public class ProductsDTO {
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
