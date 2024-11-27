package myWeddingFlow.mapper.login;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.AuthInfoDTO;

@Mapper
public interface LoginMapper {

	public AuthInfoDTO memberLoginSelectOne(String userId);

	public AuthInfoDTO vendorLoginSelectOne(String userId);

	public AuthInfoDTO plannerLoginSelectOne(String userId);

}
