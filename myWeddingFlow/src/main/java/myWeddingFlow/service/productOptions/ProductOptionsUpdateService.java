package myWeddingFlow.service.productOptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.ProductOptionsCommand;
import myWeddingFlow.domain.ProductOptionsDTO;
import myWeddingFlow.mapper.productOptions.ProductOptionsMapper;
@Service
public class ProductOptionsUpdateService {
	@Autowired
	ProductOptionsMapper productOptionsMapper;
	public void execute(ProductOptionsCommand productOptionsCommand) {
		ProductOptionsDTO dto = new ProductOptionsDTO();
		dto.setOptionId(productOptionsCommand.getOptionId());
		dto.setProductId(productOptionsCommand.getProductId());
		dto.setOptionName(productOptionsCommand.getOptionName());
		dto.setOptionPrice(productOptionsCommand.getOptionPrice());
		dto.setIsAvailable(productOptionsCommand.getIsAvailable());
		productOptionsMapper.productOptionsUpdate(dto);
	}

}
