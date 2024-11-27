package myWeddingFlow.service.checklists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.ChecklistsCommand;
import myWeddingFlow.domain.ChecklistsDTO;
import myWeddingFlow.mapper.checklists.ChecklistsMapper;

@Service
public class ChecklistsWriteService {
	@Autowired
	ChecklistsMapper checklistsMapper;
	public void execute(ChecklistsCommand checklistsCommand) {
		ChecklistsDTO dto = new ChecklistsDTO();
		dto.setChecklistId(checklistsCommand.getChecklistId());
		dto.setMemberId(checklistsCommand.getMemberId());
		dto.setChecklistSubject(checklistsCommand.getChecklistSubject());
		dto.setGoalDate(checklistsCommand.getGoalDate());
		dto.setChecklistContents(checklistsCommand.getChecklistContents());
		dto.setIsCompleted(checklistsCommand.getIsCompleted());
		checklistsMapper.checklistsInsert(dto);
	}
	
}
