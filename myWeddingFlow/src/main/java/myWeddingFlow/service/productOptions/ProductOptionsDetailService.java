package myWeddingFlow.service.productOptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ProductOptionsDTO;
import myWeddingFlow.mapper.productOptions.ProductOptionsMapper;

@Service
public class ProductOptionsDetailService {
	@Autowired
	ProductOptionsMapper productOptionsMapper;
	public void execute(String optionId, Model model) {
		ProductOptionsDTO dto = productOptionsMapper.productOptionsSelectOne(optionId);		
		model.addAttribute("dto", dto);
	}

}
