package myWeddingFlow.service.budgetManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.BudgetManagementDTO;
import myWeddingFlow.mapper.budgetManagement.BudgetManagementMapper;

@Service
public class BudgetManagementListService {
	@Autowired
	BudgetManagementMapper budgetManagementMapper;
	public void execute(Model model) {
		List<BudgetManagementDTO> list = budgetManagementMapper.budgetManagementSelectAll();
		model.addAttribute("list", list);
	}
	
}
