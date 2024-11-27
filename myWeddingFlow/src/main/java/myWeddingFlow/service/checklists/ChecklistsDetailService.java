package myWeddingFlow.service.checklists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ChecklistsDTO;
import myWeddingFlow.mapper.checklists.ChecklistsMapper;

@Service
public class ChecklistsDetailService {
	@Autowired
	ChecklistsMapper checklistsMapper;
	public void execute(String checklistId, Model model) {
		ChecklistsDTO dto = checklistsMapper.checklistsSelectOne(checklistId);
		model.addAttribute("dto", dto);
	}
	
}
