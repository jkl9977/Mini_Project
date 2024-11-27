package myWeddingFlow.mapper.planner;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.PlannerDTO;

@Mapper
public interface PlannerMapper {
	public void plannerRegist(PlannerDTO dto);
	public PlannerDTO plannerSelectOne(String plannerNum);
	public void plannerUpdate(PlannerDTO dto);
	public void plannerDelete(String plannerNum);
	public String plannerNumSelect(String userId);
}
