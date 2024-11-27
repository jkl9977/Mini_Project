package myWeddingFlow.service.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ItemDTO;
import myWeddingFlow.mapper.item.ItemMapper;

@Service
public class ItemListService {
	@Autowired
	ItemMapper itemMapper;
	public void execute(Model model) {
		List<ItemDTO> list=itemMapper.itemSelectList();
		model.addAttribute("list", list);
	}

}
