package myWeddingFlow.service.productOptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.productOptions.ProductOptionsMapper;

@Service
public class ProductOptionsDeleteService {
	@Autowired
	ProductOptionsMapper productOptionsMapper;
	public void execute(String optionId) {
		productOptionsMapper.productOptionsDelete(optionId);
	}
	
}
