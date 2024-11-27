package myWeddingFlow.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.MemberCommand;
import myWeddingFlow.domain.MemberDTO;
import myWeddingFlow.mapper.member.MemberMapper;



@Service
public class MemberRegistService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberId(memberCommand.getMemberId());
		dto.setMemberPassword(memberCommand.getMemberPassword());
		dto.setMemberPasswordCon(memberCommand.getMemberPasswordCon());
		dto.setMemberName(memberCommand.getMemberName());
		dto.setMemberAddress(memberCommand.getMemberAddress());
		dto.setMemberAddressDetail(memberCommand.getMemberAddressDetail());
		dto.setMemberPostcode(memberCommand.getMemberPostcode());
		dto.setMemberPhone1(memberCommand.getMemberPhone1());
		dto.setMemberPhone2(memberCommand.getMemberPhone2());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberEmail(memberCommand.getMemberEmail());
		memberMapper.memberRegist(dto);
		
	}
}
