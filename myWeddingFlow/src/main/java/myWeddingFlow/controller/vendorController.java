package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import myWeddingFlow.command.VendorCommand;
import myWeddingFlow.service.vendor.VendorWriteService;

@Controller
@RequestMapping("vendor")
public class vendorController {
	@Autowired
	VendorWriteService vendorWriteService;
	
	@GetMapping("vendorRegist")
	public String vendorRegist() {
		return "thymeleaf/vendor/vendorRegist";
	}
	@PostMapping("vendorRegist")
	public String vendorRegist1(VendorCommand vendorCommand){
		vendorWriteService.execute(vendorCommand);
		return "redirect:/";
	}
}
