package myWeddingFlow.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.domain.AuthInfoDTO;
import myWeddingFlow.domain.MemberDTO;
import myWeddingFlow.mapper.member.MemberMapper;

@Service
public class MemberMyPageService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth=(AuthInfoDTO)session.getAttribute("auth");
		String memberNum=memberMapper.memberNumSelect(auth.getUserId());
		MemberDTO dto = memberMapper.memberSelectOne(memberNum);
		model.addAttribute("dto", dto);
		
	}
	
	
}
