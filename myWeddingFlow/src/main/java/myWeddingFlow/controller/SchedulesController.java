package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myWeddingFlow.command.SchedulesCommand;
import myWeddingFlow.service.schedules.SchedulesDeleteService;
import myWeddingFlow.service.schedules.SchedulesDetailService;
import myWeddingFlow.service.schedules.SchedulesListService;
import myWeddingFlow.service.schedules.SchedulesUpdateService;
import myWeddingFlow.service.schedules.SchedulesWriteService;

@Controller
@RequestMapping("schedules")
public class SchedulesController {
	@Autowired
	SchedulesWriteService schedulesWriteService;
	@Autowired
	SchedulesListService schedulesListService;
	@Autowired
	SchedulesDetailService schedulesDetailService;
	@Autowired
	SchedulesUpdateService schedulesUpdateService;
	@Autowired
	SchedulesDeleteService schedulesDeleteService;
	@GetMapping("schedulesWrite") 
	public String schedulesWrite() {
		return "thymeleaf/schedules/schedulesForm";
	}
	@PostMapping("schedulesRegist")
	public String schedulesRegist(SchedulesCommand schedulesCommand) {
		schedulesWriteService.execute(schedulesCommand);
		return "redirect:/";
	}
	@GetMapping("schedulesList")
	public String schedulesList(Model model) {
		schedulesListService.execute(model);
		return "thymeleaf/schedules/schedulesList";
	}
	@GetMapping("schedulesDetail")
	public String schedulesDetail(@RequestParam("scheduleId") String scheduleId, Model model) {
		schedulesDetailService.execute(scheduleId, model);
		return "thymeleaf/schedules/schedulesInfo";
	}
	@GetMapping("schedulesUpdate")
	public String schedulesUpdate(@RequestParam("scheduleId") String scheduleId, Model model) {
		schedulesDetailService.execute(scheduleId, model);
		return "thymeleaf/schedules/schedulesModify";
	}
	@PostMapping("schedulesModify")
	public String schedulesModify(SchedulesCommand schedulesCommand) {
		schedulesUpdateService.execute(schedulesCommand);
		return "redirect:/";
	}
	@GetMapping("schedulesDelete")
	public String schedulesDelete(@RequestParam("scheduleId") String scheduleId) {
		schedulesDeleteService.execute(scheduleId);
		return "redirect:/";
	}
	
}
