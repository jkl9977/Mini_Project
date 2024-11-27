package myWeddingFlow.service.schedules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.SchedulesDTO;
import myWeddingFlow.mapper.schedules.SchedulesMapper;

@Service
public class SchedulesDetailService {
	@Autowired
	SchedulesMapper schedulesMapper;
	public void execute(String scheduleId, Model model) {
		SchedulesDTO dto = schedulesMapper.schedulesSelectOne(scheduleId);
		model.addAttribute("dto", dto);
	}

}
