package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.command.VendorCommand;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.vendor.VendorDeleteService;
import myWeddingFlow.service.vendor.VendorDetailService;
import myWeddingFlow.service.vendor.VendorUpdateService;
import myWeddingFlow.service.vendor.VendorWriteService;

@Controller
@RequestMapping("vendor")
public class VendorController {
	@Autowired
	VendorWriteService vendorWriteService;
	@Autowired
	VendorUpdateService vendorUpdateService;
	@Autowired
	VendorDetailService vendorDetailService;
	@Autowired
	VendorDeleteService vendorDeleteService;
	@Autowired
	AutoNumService autoNumService;
	
	@GetMapping("vendorRegist")
	public String vendorRegist(VendorCommand vendorCommand, Model model) {
		String autoNum=autoNumService.execute("ven_", "vendor_Num", 5, "vendors");
		vendorCommand.setVendorNum(autoNum);
		model.addAttribute("vendorCommand", vendorCommand);
		return "thymeleaf/vendor/vendorRegist";
	}
	@PostMapping("vendorRegist")
	public String vendorRegist1(VendorCommand vendorCommand){
		vendorWriteService.execute(vendorCommand);
		return "redirect:/";
	}
	@GetMapping("vendorMyPage")
	public String vendorDetail(Model model,HttpSession session) {
		vendorDetailService.execute(model,session);
		return "thymeleaf/vendor/vendorDetail";
	}
	@GetMapping("vendorUpdate")
	public String vendorUpdate(Model model,HttpSession session) {
		vendorDetailService.execute(model,session);
		//vendorUpdateService.execute(vendorCommand);
		return "thymeleaf/vendor/vendorUpdate";
	}
	@PostMapping("vendorUpdate")
	public String vendorUpdate(String vendorNum, VendorCommand vendorCommand) {
		vendorUpdateService.execute(vendorCommand, vendorNum);
		return "redirect:vendorMyPage";
	}
	@GetMapping("vendorDelete")
	public String vendorDelete(String vendorNum) {
		vendorDeleteService.execute(vendorNum);
		return "redirect:/";
	}
}
