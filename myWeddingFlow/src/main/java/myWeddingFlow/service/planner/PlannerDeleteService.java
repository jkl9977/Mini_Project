package myWeddingFlow.service.planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.planner.PlannerMapper;

@Service
public class PlannerDeleteService {
	@Autowired
	PlannerMapper plannerMapper;
	public void execute(String plannerNum) {
		plannerMapper.plannerDelete(plannerNum);
		
	}

}
