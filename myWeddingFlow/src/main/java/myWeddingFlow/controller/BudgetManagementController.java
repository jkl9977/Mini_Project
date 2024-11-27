package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myWeddingFlow.command.BudgetManagementCommand;
import myWeddingFlow.service.budgetManagement.BudgetManagementDeleteService;
import myWeddingFlow.service.budgetManagement.BudgetManagementDetailService;
import myWeddingFlow.service.budgetManagement.BudgetManagementListService;
import myWeddingFlow.service.budgetManagement.BudgetManagementUpdateService;
import myWeddingFlow.service.budgetManagement.BudgetManagementWriteService;

@Controller
@RequestMapping("budgetManagement")
public class BudgetManagementController {
	@Autowired
	BudgetManagementWriteService budgetManagementWriteService;
	@Autowired
	BudgetManagementListService budgetManagementListService;
	@Autowired
	BudgetManagementDetailService budgetManagementDetailService;
	@Autowired
	BudgetManagementUpdateService budgetManagementUpdateService;
	@Autowired
	BudgetManagementDeleteService budgetManagementDeleteService;
	@GetMapping("budgetManagementWrite")
	public String budgetManagementWrite() {
		return "thymeleaf/budgetManagement/budgetManagementForm";
	}
	@PostMapping("budgetManagementRegist")
	public String budgetManagementRegist(BudgetManagementCommand budgetManagementCommand) {
		budgetManagementWriteService.execute(budgetManagementCommand);
		return "redirect:/";
	}
	@GetMapping("budgetManagementList")
	public String budgetManagementList(Model model) {
		budgetManagementListService.execute(model);
		return "thymeleaf/budgetManagement/budgetManagementList";
	}
	@GetMapping("budgetManagementDetail")
	public String budgetManagementDetail(@RequestParam("budgetId") String budgetId, Model model) {
		budgetManagementDetailService.execute(budgetId, model);
		return "thymeleaf/budgetManagement/budgetManagementInfo";
	}
	@GetMapping("budgetManagementUpdate")
	public String budgetManagementUpdate(@RequestParam("budgetId") String budgetId, Model model) {
		budgetManagementDetailService.execute(budgetId, model);
		return "thymeleaf/budgetManagement/budgetManagementModify";
	}
	@PostMapping("budgetManagementModify")
	public String budgetManagementModify(BudgetManagementCommand budgetManagementCommand) {
		budgetManagementUpdateService.execute(budgetManagementCommand);
		return "redirect:budgetManagementDetail?budgetId="+budgetManagementCommand.getBudgetId();	
	}
	@GetMapping("budgetManagementDelete")
	public String budgetManagementDelete(@RequestParam("budgetId") String budgetId) {
		budgetManagementDeleteService.execute(budgetId);
		return "redirect:/";
	}
	
}
