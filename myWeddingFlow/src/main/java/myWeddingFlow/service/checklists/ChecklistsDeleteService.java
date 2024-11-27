package myWeddingFlow.service.checklists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.checklists.ChecklistsMapper;

@Service
public class ChecklistsDeleteService {
	@Autowired
	ChecklistsMapper checklistsMapper;
	public void execute(String checklistId) {
		checklistsMapper.checklistsDelete(checklistId);
	}

}
