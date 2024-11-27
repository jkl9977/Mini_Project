package myWeddingFlow.service.planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.PlannerCommand;
import myWeddingFlow.domain.PlannerDTO;
import myWeddingFlow.mapper.planner.PlannerMapper;



@Service
public class PlannerRegistService {
	@Autowired
	PlannerMapper plannerMapper;
	public void execute(PlannerCommand plannerCommand) {
		PlannerDTO dto = new PlannerDTO();
		dto.setPlannerNum(plannerCommand.getPlannerNum());
		dto.setPlannerId(plannerCommand.getPlannerId());
		dto.setPlannerPassword(plannerCommand.getPlannerPassword());
		dto.setPlannerPasswordCon(plannerCommand.getPlannerPasswordCon());
		dto.setPlannerName(plannerCommand.getPlannerName());
		dto.setPlannerAddress(plannerCommand.getPlannerAddress());
		dto.setPlannerAddressDetail(plannerCommand.getPlannerAddressDetail());
		dto.setPlannerPostcode(plannerCommand.getPlannerPostcode());
		dto.setPlannerPhone1(plannerCommand.getPlannerPhone1());
		dto.setPlannerPhone2(plannerCommand.getPlannerPhone2());
		dto.setPlannerBirth(plannerCommand.getPlannerBirth());
		dto.setPlannerEmail(plannerCommand.getPlannerEmail());
		plannerMapper.plannerRegist(dto);
		
	}
}
