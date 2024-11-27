package myWeddingFlow.service.planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.domain.AuthInfoDTO;
import myWeddingFlow.domain.PlannerDTO;
import myWeddingFlow.mapper.planner.PlannerMapper;

@Service
public class PlannerMyPageService {
	@Autowired
	PlannerMapper plannerMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth=(AuthInfoDTO)session.getAttribute("auth");
		String plannerNum=plannerMapper.plannerNumSelect(auth.getUserId());
		PlannerDTO dto = plannerMapper.plannerSelectOne(plannerNum);
		model.addAttribute("dto", dto);
		
	}
	
	
}
