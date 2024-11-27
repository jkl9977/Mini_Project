package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myWeddingFlow.service.item.ItemListService;

@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	ItemListService itemListService;
	
	@GetMapping("itemList")
	public String itemList(Model model //,String category //searchword 같은 기능추가할 예정
			) {
		itemListService.execute(model);
		return "thymeleaf/item/itemList";
	}
	@GetMapping("itemDetail")
	public String getMethodName(@RequestParam("itemId") String itemId) {
		
		return "thymeleaf/item/itemDetail";
	}
	
}