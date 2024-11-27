package myWeddingFlow.command;

import lombok.Data;

@Data
public class ProductOptionsCommand {
	String optionId;
    String productId;
    String optionName;
    String optionPrice;
    String isAvailable;
}
