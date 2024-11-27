package myWeddingFlow.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("productOptionsDTO")
public class ProductOptionsDTO {
	String optionId;
    String productId;
    String optionName;
    String optionPrice;
    String isAvailable;
}
