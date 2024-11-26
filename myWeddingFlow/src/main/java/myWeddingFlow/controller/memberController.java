package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myWeddingFlow.command.MemberCommand;
import myWeddingFlow.service.member.MemberMyPageService;
import myWeddingFlow.service.member.MemberRegistService;

@Controller
@RequestMapping("member")
public class memberController {
	@Autowired
	MemberRegistService memberRegistService;
	@Autowired
	MemberMyPageService memberMyPageService;
	
	@GetMapping("memberForm")
	public String memberForm() {
		return "thymeleaf/member/memberForm";
	}
	@PostMapping("memberRegist")
	public String memberRegist(MemberCommand memberCommand) {
		memberRegistService.execute(memberCommand);
		return "redirect:/";
	}
	@GetMapping("memberMyPage")
	   public String memberMyPage(@RequestParam("memberNum") String memberNum, Model model) {
		memberMyPageService.execute(memberNum, model);
	    return "thymeleaf/member/memberMyPage";
	}
	
}
