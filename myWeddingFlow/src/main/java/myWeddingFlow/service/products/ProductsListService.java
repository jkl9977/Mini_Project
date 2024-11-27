package myWeddingFlow.service.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ProductsDTO;
import myWeddingFlow.mapper.products.ProductsMapper;

@Service
public class ProductsListService {
	@Autowired
	ProductsMapper productsMapper;
	public void execute(Model model) {
		List<ProductsDTO> list = productsMapper.productsSelectAll();
		model.addAttribute("list", list);
	}

}
