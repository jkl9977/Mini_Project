package myWeddingFlow.service.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.products.ProductsMapper;

@Service
public class ProductsDeleteService {
	@Autowired
	ProductsMapper productsMapper;
	public void execute(String productId) {
		productsMapper.productsDelete(productId);
	}
	
}
