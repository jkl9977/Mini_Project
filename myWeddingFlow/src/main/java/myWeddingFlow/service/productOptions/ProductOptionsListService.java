package myWeddingFlow.service.productOptions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ProductOptionsDTO;
import myWeddingFlow.mapper.productOptions.ProductOptionsMapper;
@Service
public class ProductOptionsListService {
	@Autowired
	ProductOptionsMapper productOptionsMapper;
	public void execute(Model model) {
		List<ProductOptionsDTO> list = productOptionsMapper.productOptionsSelectAll();
		model.addAttribute("list", list);
	}
	

}
