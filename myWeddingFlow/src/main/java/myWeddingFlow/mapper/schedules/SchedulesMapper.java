package myWeddingFlow.mapper.schedules;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.SchedulesDTO;

@Mapper
public interface SchedulesMapper {
	public void schedulesInsert(SchedulesDTO dto);
	public List<SchedulesDTO> schedulesSelectAll();
	public SchedulesDTO schedulesSelectOne(String scheduleId);
	public void schedulesUpdate(SchedulesDTO dto);
	public void schedulesDelete(String scheduleId);
	
}
