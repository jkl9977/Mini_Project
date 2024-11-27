package myWeddingFlow.mapper.item;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.ItemDTO;

@Mapper
public interface ItemMapper {

	public List<ItemDTO> itemSelectList();

}
