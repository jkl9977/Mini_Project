package myWeddingFlow.command;

import lombok.Data;

@Data
public class BudgetManagementCommand {
	String budgetId;
	String memberId; 
	String category;
	Integer targetBudget;
	Integer actualCost;
	Integer remainingBudget;
}
