package myWeddingFlow.service.checklists;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.ChecklistsDTO;
import myWeddingFlow.mapper.checklists.ChecklistsMapper;
@Service
public class ChecklistsListService {
	@Autowired
	ChecklistsMapper checklistsMapper;
	public void execute(Model model) {
		List<ChecklistsDTO> list = checklistsMapper.checklistsSelectAll();
		model.addAttribute("list", list);
	}

}
