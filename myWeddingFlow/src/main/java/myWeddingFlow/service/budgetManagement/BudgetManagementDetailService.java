package myWeddingFlow.service.budgetManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.BudgetManagementDTO;
import myWeddingFlow.mapper.budgetManagement.BudgetManagementMapper;

@Service
public class BudgetManagementDetailService {
	@Autowired
	BudgetManagementMapper budgetManagementMapper;
	public void execute(String budgetId, Model model) {
		BudgetManagementDTO dto = budgetManagementMapper.budgetManagementSelectOne(budgetId);
		model.addAttribute("dto", dto);
	}
	
}
