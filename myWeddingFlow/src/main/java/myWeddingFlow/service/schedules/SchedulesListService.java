package myWeddingFlow.service.schedules;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.SchedulesDTO;
import myWeddingFlow.mapper.schedules.SchedulesMapper;

@Service
public class SchedulesListService {
	@Autowired
	SchedulesMapper schedulesMapper;
	public void execute(Model model) {
		List<SchedulesDTO> list = schedulesMapper.schedulesSelectAll();
		model.addAttribute("list", list);
	}

}
