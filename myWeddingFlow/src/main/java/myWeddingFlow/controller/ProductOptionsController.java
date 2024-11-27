package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myWeddingFlow.command.ProductOptionsCommand;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.productOptions.ProductOptionsDeleteService;
import myWeddingFlow.service.productOptions.ProductOptionsDetailService;
import myWeddingFlow.service.productOptions.ProductOptionsListService;
import myWeddingFlow.service.productOptions.ProductOptionsUpdateService;
import myWeddingFlow.service.productOptions.ProductOptionsWriteService;

@Controller
@RequestMapping("productOptions")
public class ProductOptionsController {
	@Autowired
	ProductOptionsWriteService productOptionsWriteService;
	@Autowired
	ProductOptionsListService productOptionsListService;
	@Autowired
	ProductOptionsDetailService productOptionsDetailService;
	@Autowired
	ProductOptionsUpdateService productOptionsUpdateService;
	@Autowired
	ProductOptionsDeleteService productOptionsDeleteService;
	@Autowired
	AutoNumService autoNumService;
	@GetMapping("productOptionsWrite")
	public String productOptionsWrite(ProductOptionsCommand productOptionsCommand, Model model) {
		String autoNum=autoNumService.execute("opt_","option_Id",5,"product_Options");
		productOptionsCommand.setOptionId(autoNum);
		model.addAttribute("productOptionsCommand", productOptionsCommand);
		return "thymeleaf/productOptions/productOptionsForm";
	}
	@PostMapping("productOptionsRegist")
	public String productOptionsRegist(ProductOptionsCommand productOptionsCommand) {
		productOptionsWriteService.execute(productOptionsCommand);
		return "redirect:/";
	}
	@GetMapping("productOptionsList")
	public String productOptionsList(Model model) {
		productOptionsListService.execute(model);
		return "thymeleaf/productOptions/productOptionsList";
	}
	@GetMapping("productOptionsDetail")
	public String productOptionsDetail(@RequestParam("optionId") String optionId, Model model) {
		productOptionsDetailService.execute(optionId, model);
		return "thymeleaf/productOptions/productOptionsInfo";
	}
	@GetMapping("productOptionsUpdate")
	public String productOptionsUpdate(@RequestParam("optionId") String optionId, Model model) {
		productOptionsDetailService.execute(optionId, model);
		return "thymeleaf/productOptions/productOptionsModify";
	}
	@PostMapping("productOptionsModify")
	public String productOptionsModify(ProductOptionsCommand productOptionsCommand) {
		productOptionsUpdateService.execute(productOptionsCommand);
		return "redirect:productOptionsDetail?optionId="+productOptionsCommand.getOptionId();
	}
	@GetMapping("productOptionsDelete")
	public String productOptionsDelete(@RequestParam("optionId") String optionId) {
		productOptionsDeleteService.execute(optionId);
		return "redirect:/";
	}
}

