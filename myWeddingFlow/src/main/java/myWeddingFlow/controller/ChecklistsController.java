package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myWeddingFlow.command.ChecklistsCommand;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.checklists.ChecklistsDeleteService;
import myWeddingFlow.service.checklists.ChecklistsDetailService;
import myWeddingFlow.service.checklists.ChecklistsListService;
import myWeddingFlow.service.checklists.ChecklistsUpdateService;
import myWeddingFlow.service.checklists.ChecklistsWriteService;

@Controller
@RequestMapping("checklists")
public class ChecklistsController {
	@Autowired
	ChecklistsWriteService checklistsWriteService;
	@Autowired
	ChecklistsListService checklistsListService;
	@Autowired
	ChecklistsDetailService checklistsDetailService;
	@Autowired
	ChecklistsUpdateService checklistsUpdateService;
	@Autowired
	ChecklistsDeleteService checklistsDeleteService;
	@Autowired
	AutoNumService autoNumService;
	@GetMapping("checklistsList")
	public String checklistsList(Model model) {
		checklistsListService.execute(model);
		return "thymeleaf/checklists/checklistsList";
	}
	@GetMapping("checklistsWrite")
	public String checklistsWrite(ChecklistsCommand checklistsCommand, Model model) {
		String autoNum=autoNumService.execute("check_","checklist_id",7,"checklists");
		checklistsCommand.setChecklistId(autoNum);
		model.addAttribute("checklistsCommand", checklistsCommand);
		return "thymeleaf/checklists/checklistsForm";
	}
	@PostMapping("checklistsRegist")
	public String checklistsRegist(ChecklistsCommand checklistsCommand) {
		checklistsWriteService.execute(checklistsCommand);
		return "redirect:/";
	}
	@GetMapping("checklistsDetail")
	public String checklistsDetail(@RequestParam("checklistId") String checklistId, Model model) {
		checklistsDetailService.execute(checklistId, model);
		return "thymeleaf/checklists/checklistsInfo";
	}
	@GetMapping("checklistsUpdate")
	public String checklistsUpdate(@RequestParam("checklistId") String checklistId, Model model) {
		checklistsDetailService.execute(checklistId, model);
		return "thymeleaf/checklists/checklistsModify";
	}
	@PostMapping("checklistsModify")
	public String checklistsModify(ChecklistsCommand checklistsCommand) {
		checklistsUpdateService.execute(checklistsCommand);
		return "redirect:checklistsDetail?checklistId="+checklistsCommand.getChecklistId();
	}
	@GetMapping("checklistsDelete")
	public String checklistsDelete(@RequestParam("checklistId") String checklistId) {
		checklistsDeleteService.execute(checklistId);
		return "redirect:/";
	}
}
