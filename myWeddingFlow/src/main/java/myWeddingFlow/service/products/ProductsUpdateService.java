package myWeddingFlow.service.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.ProductsCommand;
import myWeddingFlow.domain.ProductsDTO;
import myWeddingFlow.mapper.products.ProductsMapper;
@Service
public class ProductsUpdateService {
	@Autowired
	ProductsMapper productsMapper;
	public void execute(ProductsCommand productsCommand) {
		ProductsDTO dto = new ProductsDTO();
		dto.setProductId(productsCommand.getProductId());
		dto.setVendorNum(productsCommand.getVendorNum());
		dto.setProductType(productsCommand.getProductType());
		dto.setProductName(productsCommand.getProductName());
		dto.setProductContents(productsCommand.getProductContents());
		dto.setProductPrice(productsCommand.getProductPrice());
		dto.setPenaltyCondition(productsCommand.getPenaltyCondition());
		dto.setAvailableDates(productsCommand.getAvailableDates());
		dto.setContractTerms(productsCommand.getContractTerms());
		dto.setAvailability(productsCommand.getAvailability());
		productsMapper.productsUpdate(dto);

	}

}
