package myWeddingFlow.service.schedules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.SchedulesCommand;
import myWeddingFlow.domain.SchedulesDTO;
import myWeddingFlow.mapper.schedules.SchedulesMapper;

@Service
public class SchedulesUpdateService {
	@Autowired
	SchedulesMapper schedulesMapper;
	public void execute(SchedulesCommand schedulesCommand) {
		SchedulesDTO dto = new SchedulesDTO();
		dto.setScheduleId(schedulesCommand.getScheduleId());
		dto.setMemberId(schedulesCommand.getMemberId());
		dto.setScheduleSubject(schedulesCommand.getScheduleSubject());
		dto.setScheduleContents(schedulesCommand.getScheduleContents());
		dto.setScheduleDate(schedulesCommand.getScheduleDate());
		dto.setStartTime(schedulesCommand.getStartTime());
		dto.setEndTime(schedulesCommand.getEndTime());
		dto.setScheduleLocation(schedulesCommand.getScheduleLocation());
		dto.setScheduleStatus(schedulesCommand.getScheduleStatus());
		schedulesMapper.schedulesUpdate(dto);
		
	}
	
}
