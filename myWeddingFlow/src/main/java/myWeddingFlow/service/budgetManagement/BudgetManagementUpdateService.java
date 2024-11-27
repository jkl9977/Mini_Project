package myWeddingFlow.service.budgetManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.BudgetManagementCommand;
import myWeddingFlow.domain.BudgetManagementDTO;
import myWeddingFlow.mapper.budgetManagement.BudgetManagementMapper;

@Service
public class BudgetManagementUpdateService {
	@Autowired
	BudgetManagementMapper budgetManagementMapper;
	public void execute(BudgetManagementCommand budgetManagementCommand) {
		BudgetManagementDTO dto = new BudgetManagementDTO();
		dto.setBudgetId(budgetManagementCommand.getBudgetId());
		dto.setMemberId(budgetManagementCommand.getMemberId());
		dto.setCategory(budgetManagementCommand.getCategory());
		dto.setTargetBudget(budgetManagementCommand.getTargetBudget());
		dto.setActualCost(budgetManagementCommand.getActualCost());
		dto.setRemainingBudget(budgetManagementCommand.getRemainingBudget());
		budgetManagementMapper.budgetManagementUpdate(dto);
	}
	
}
