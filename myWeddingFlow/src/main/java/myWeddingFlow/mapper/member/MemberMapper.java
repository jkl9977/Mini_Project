package myWeddingFlow.mapper.member;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	public void memberRegist(MemberDTO dto);
	public MemberDTO memberSelectOne(String memberNum);
	public void memberUpdate(MemberDTO dto);
	public void memberDelete(String memberNum);
	public String memberNumSelect(String userId);
}
