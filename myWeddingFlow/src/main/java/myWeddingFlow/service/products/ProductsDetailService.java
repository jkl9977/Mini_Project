package myWeddingFlow.service.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ProductsDTO;
import myWeddingFlow.mapper.products.ProductsMapper;

@Service
public class ProductsDetailService {
	@Autowired
	ProductsMapper productsMapper;
	public void execute(String productId, Model model) {
		ProductsDTO dto = productsMapper.productsSelectOne(productId);
		model.addAttribute("dto", dto);
	}
	
}
