package myWeddingFlow.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.MemberCommand;
import myWeddingFlow.domain.MemberDTO;
import myWeddingFlow.mapper.member.MemberMapper;
@Service
public class MemberUpdateService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setMemberId(memberCommand.getMemberId());
		dto.setMemberName(memberCommand.getMemberName());
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberAddress(memberCommand.getMemberAddress());
		dto.setMemberAddressDetail(memberCommand.getMemberAddressDetail());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberEmail(memberCommand.getMemberEmail());
		dto.setMemberPhone1(memberCommand.getMemberPhone1());
		dto.setMemberPhone2(memberCommand.getMemberPhone2());
		dto.setMemberPostcode(memberCommand.getMemberPostcode());
		dto.setMemberProfileImage(memberCommand.getMemberProfileImage());
		memberMapper.memberUpdate(dto);
	}

}
