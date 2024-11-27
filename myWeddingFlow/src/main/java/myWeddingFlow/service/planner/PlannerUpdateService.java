package myWeddingFlow.service.planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.PlannerCommand;
import myWeddingFlow.domain.PlannerDTO;
import myWeddingFlow.mapper.planner.PlannerMapper;
@Service
public class PlannerUpdateService {
	@Autowired
	PlannerMapper PlannerMapper;
	public void execute(PlannerCommand plannerCommand) {
		PlannerDTO dto = new PlannerDTO();
		dto.setPlannerId(plannerCommand.getPlannerId());
		dto.setPlannerName(plannerCommand.getPlannerName());
		dto.setPlannerNum(plannerCommand.getPlannerNum());
		dto.setPlannerAddress(plannerCommand.getPlannerAddress());
		dto.setPlannerAddressDetail(plannerCommand.getPlannerAddressDetail());
		dto.setPlannerBirth(plannerCommand.getPlannerBirth());
		dto.setPlannerEmail(plannerCommand.getPlannerEmail());
		dto.setPlannerPhone1(plannerCommand.getPlannerPhone1());
		dto.setPlannerPhone2(plannerCommand.getPlannerPhone2());
		dto.setPlannerPostcode(plannerCommand.getPlannerPostcode());
		dto.setPlannerProfileImage(plannerCommand.getPlannerProfileImage());
		PlannerMapper.plannerUpdate(dto);
	}

}
