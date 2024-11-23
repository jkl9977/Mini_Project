package myWeddingFlow.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.MemberDTO;
import myWeddingFlow.mapper.member.MemberMapper;

@Service
public class MemberMyPageService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(String memberNum, Model model) {
		MemberDTO dto = memberMapper.memberSelectOne(memberNum);
		model.addAttribute("dto", dto);
		
	}
	
	
}
