package myWeddingFlow.service.budgetManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.budgetManagement.BudgetManagementMapper;

@Service
public class BudgetManagementDeleteService {
	@Autowired
	BudgetManagementMapper budgetManagementMapper;
	public void execute(String budgetId) {
		budgetManagementMapper.budgetManagementDelete(budgetId);
	}
	
}
