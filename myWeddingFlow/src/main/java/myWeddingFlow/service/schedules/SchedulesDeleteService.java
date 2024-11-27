package myWeddingFlow.service.schedules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.schedules.SchedulesMapper;

@Service
public class SchedulesDeleteService {
	@Autowired
	SchedulesMapper schedulesMapper;
	 public void execute(String scheduleId) {
		 schedulesMapper.schedulesDelete(scheduleId);
		
	}
	
}
