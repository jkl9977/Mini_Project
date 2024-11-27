package myWeddingFlow.mapper.products;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.ProductsDTO;

@Mapper
public interface ProductsMapper {
	public void productsWrite(ProductsDTO dto);
	public List<ProductsDTO> productsSelectAll();
	public ProductsDTO productsSelectOne(String productId);
	public void productsUpdate(ProductsDTO dto);
	public void productsDelete(String productId);

}
