package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import myWeddingFlow.command.ProductsCommand;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.products.ProductsDeleteService;
import myWeddingFlow.service.products.ProductsDetailService;
import myWeddingFlow.service.products.ProductsListService;
import myWeddingFlow.service.products.ProductsUpdateService;
import myWeddingFlow.service.products.ProductsWriteService;

@Controller
@RequestMapping("products")
public class ProductsController {
	@Autowired
	ProductsWriteService productsWriteService;
	@Autowired
	ProductsListService productsListService;
	@Autowired
	ProductsDetailService productsDetailService;
	@Autowired
	ProductsUpdateService productsUpdateService;
	@Autowired
	ProductsDeleteService productsDeleteService;
	@Autowired
	AutoNumService autoNumService;
	@GetMapping("productsForm")
	public String productsForm(ProductsCommand productsCommand, Model model) {
		String autoNum=autoNumService.execute("product_","product_id",9,"products");
		productsCommand.setProductId(autoNum);
		model.addAttribute("productsCommand", productsCommand);
		return "thymeleaf/products/productsForm";
	}
	@PostMapping("productsForm")
	public String productsForm(ProductsCommand productsCommand) {
		productsWriteService.execute(productsCommand);
		return "redirect:/";
	}
	@GetMapping("productsList")
	public String productsList(Model model) {
		productsListService.execute(model);
		return "thymeleaf/products/productsList";
		
	}
	@GetMapping("productsDetail")
	public String productsDetail(@RequestParam("productId") String productId, Model model) {
		productsDetailService.execute(productId, model);
		return "thymeleaf/products/productsInfo";
	}
	@GetMapping("productsUpdate")
	public String productsUpdate(@RequestParam("productId") String productId, Model model) {
		productsDetailService.execute(productId, model);
	    return "thymeleaf/products/productsModify";
	}
	@PostMapping("productsModify")
	public String productsModify(ProductsCommand productsCommand) {
		productsUpdateService.execute(productsCommand);
		return "redirect:productsDetail?productId="+productsCommand.getProductId();
	}
	@GetMapping("productsDelete")
	public String productsDelete(@RequestParam("productId") String productId) {
		productsDeleteService.execute(productId);
		return "redirect:/";
	}
}
