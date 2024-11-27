package myWeddingFlow.mapper.checklists;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.ChecklistsDTO;

@Mapper
public interface ChecklistsMapper {
	public void checklistsInsert(ChecklistsDTO dto);
	public List<ChecklistsDTO> checklistsSelectAll();
	public ChecklistsDTO checklistsSelectOne(String checklistId);
	public void checklistsUpdate(ChecklistsDTO dto);
	public void checklistsDelete(String checklistId);
	
}
