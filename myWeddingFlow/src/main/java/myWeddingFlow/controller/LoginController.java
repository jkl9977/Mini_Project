package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.command.LoginCommand;
import myWeddingFlow.service.login.MemberLoginService;
import myWeddingFlow.service.login.PlannerLoginService;
import myWeddingFlow.service.login.VendorLoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	MemberLoginService memberLoginService;
	@Autowired
	PlannerLoginService plannerLoginService;
	@Autowired
	VendorLoginService vendorLoginService;
	
	@GetMapping("login")
	public String login(//@Validated LoginCommand loginCommand, Model model
			) {
		//model.addAttribute("loginCommand", loginCommand);
		return "thymeleaf/login";
	}
	@PostMapping("member")
	public String login(@Validated LoginCommand loginCommand, HttpSession session,
			BindingResult result) { //@Validated, BindingResult result
		memberLoginService.execute(loginCommand, session, result);
		if(result.hasErrors()) { 
			 return "redirect:login"; 
		}
		return "redirect:/";
	}
	@PostMapping("planner")
	public String login1(@Validated LoginCommand loginCommand, HttpSession session
			, BindingResult result) {
		plannerLoginService.execute(loginCommand, session, result);
		if(result.hasErrors()) { 
			 return "redirect:login"; 
		}
		return "redirect:/";
	}
	
	@PostMapping("vendor")
	public String login2(@Validated LoginCommand loginCommand,HttpSession session
			,BindingResult result) {
		vendorLoginService.execute(loginCommand, session, result);
		if(result.hasErrors()) { 
			 return "redirect:login"; 
		}
		return "redirect:/";
	}
}





