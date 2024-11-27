package myWeddingFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.command.MemberCommand;
import myWeddingFlow.service.member.MemberUpdateService;
import myWeddingFlow.service.AutoNumService;
import myWeddingFlow.service.member.MemberDeleteService;
import myWeddingFlow.service.member.MemberMyPageService;
import myWeddingFlow.service.member.MemberRegistService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberRegistService memberRegistService;
	@Autowired
	MemberMyPageService memberMyPageService;
	@Autowired
	MemberUpdateService memberUpdateService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@Autowired
	AutoNumService autoNumService;
	
	@GetMapping("memberForm")
	public String memberForm(MemberCommand memberCommand, Model model) {
		String autoNum=autoNumService.execute("mem_","member_num",5,"members");
		memberCommand.setMemberNum(autoNum);
		model.addAttribute("memberCommand", memberCommand);
		return "thymeleaf/member/memberForm";
	}
	@PostMapping("memberRegist")
	public String memberRegist(MemberCommand memberCommand) {
		memberRegistService.execute(memberCommand);
		return "redirect:/";
	}
	@GetMapping("memberMyPage")
	public String memberMyPage(HttpSession session, Model model) {
		memberMyPageService.execute(session, model);
	    return "thymeleaf/member/memberMyPage";
	}
	@GetMapping("memberUpdate")
	public String memberUpdate(HttpSession session, Model model) {
		memberMyPageService.execute(session, model);
	    return "thymeleaf/member/memberModify";
	}
	@PostMapping("memberModify")
	public String memberModify(MemberCommand memberCommand) {
		memberUpdateService.execute(memberCommand);
		return "redirect:memberMyPage?memberNum="+memberCommand.getMemberNum();
	}
	@GetMapping("memberDelete")
	public String memberDelete(String memberNum) {
		memberDeleteService.execute(memberNum);
		return "redirect:/";
	}
	
}
