package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.command.PlannerCommand;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.planner.PlannerDeleteService;
import myWeddingFlow.service.planner.PlannerMyPageService;
import myWeddingFlow.service.planner.PlannerRegistService;
import myWeddingFlow.service.planner.PlannerUpdateService;

@Controller
@RequestMapping("planner")
public class PlannerController {
	@Autowired
	PlannerRegistService plannerRegistService;
	@Autowired
	PlannerMyPageService plannerMyPageService;
	@Autowired
	PlannerUpdateService plannerUpdateService;
	@Autowired
	PlannerDeleteService plannerDeleteService; 
	@Autowired
	AutoNumService autoNumService;
	
	@GetMapping("plannerForm")
	public String plannerForm(PlannerCommand plannerCommand, Model model) {
		String autoNum=autoNumService.execute("plan_","planner_num",6,"planners");
		plannerCommand.setPlannerNum(autoNum);
		model.addAttribute("plannerCommand", plannerCommand);
		return "thymeleaf/planner/plannerForm";
	}
	@PostMapping("plannerRegist")
	public String plannerRegist(PlannerCommand plannerCommand) {
		plannerRegistService.execute(plannerCommand);
		return "redirect:/";
	}
	@GetMapping("plannerMyPage")
	public String plannerMyPage(HttpSession session, Model model) {
		plannerMyPageService.execute(session, model);
	    return "thymeleaf/planner/plannerMyPage";
	}
	@GetMapping("plannerUpdate")
	public String plannerUpdate(HttpSession session, Model model) {
		plannerMyPageService.execute(session, model);
	    return "thymeleaf/planner/plannerModify";
	}
	@PostMapping("plannerModify")
	public String plannerModify(PlannerCommand plannerCommand) {
		plannerUpdateService.execute(plannerCommand);
		return "redirect:plannerMyPage?plannerNum="+plannerCommand.getPlannerNum();
	}
	@GetMapping("plannerDelete")
	public String plannerDelete(String plannerNum) {
		plannerDeleteService.execute(plannerNum);
		return "redirect:/";
	}
	
}
