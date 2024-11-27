package myWeddingFlow.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("budgetManagementDTO")
public class BudgetManagementDTO {
	String budgetId;
	String memberId;
	String category;
	Integer targetBudget;
	Integer actualCost;
	Integer remainingBudget;
}
