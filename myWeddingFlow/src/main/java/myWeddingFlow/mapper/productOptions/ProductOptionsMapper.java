package myWeddingFlow.mapper.productOptions;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.ProductOptionsDTO;

@Mapper
public interface ProductOptionsMapper {
	public void productOptionsInsert(ProductOptionsDTO dto);
	public List<ProductOptionsDTO> productOptionsSelectAll();
	public ProductOptionsDTO productOptionsSelectOne(String optionId);
	public void productOptionsUpdate(ProductOptionsDTO dto);
	public void productOptionsDelete(String optionId);
	
}
