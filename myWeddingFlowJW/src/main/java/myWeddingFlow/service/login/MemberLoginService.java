package myWeddingFlow.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.command.LoginCommand;
import myWeddingFlow.domain.AuthInfoDTO;
import myWeddingFlow.mapper.LoginMapper;

@Service
public class MemberLoginService {
	@Autowired
	LoginMapper loginMapper;
	/*
	 * @Autowired 
	 * PasswordEncoder passwordEncoder;
	 */

	public void execute(LoginCommand loginCommand, HttpSession session, BindingResult result) {
		AuthInfoDTO auth=loginMapper.memberLoginSelectOne(loginCommand.getUserId());
		//아이디가 존재하는 경우 세션 생성, 아이디가 없으면 세션 생성X
		
		
		
		if(auth!=null) { //세션이 있다=아이디가 있다.
			System.out.println("아이디:" +loginCommand.getUserId());
			if(loginCommand.getUserPw().equals(auth.getUserPw())){  //passwordEncoder.matches(loginCommand.getUserPw(),auth.getUserPw())
				System.out.println("비밀번호가 일치합니다.");
				session.setAttribute("auth", auth);
			}else {//비밀번호 불일치
				result.rejectValue("userPw", "loginCommand.userPw", "비밀번호가 틀렸습니다.");
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {//유저 아이디가 존재하지 않는 겨우
			result.rejectValue("userId", "loginCommand.userId", "아이디가 존재하지 않습니다.");
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}
}
