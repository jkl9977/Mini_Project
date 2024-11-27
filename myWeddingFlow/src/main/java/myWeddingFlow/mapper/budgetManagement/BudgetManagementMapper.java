package myWeddingFlow.mapper.budgetManagement;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.BudgetManagementDTO;

@Mapper
public interface BudgetManagementMapper {
	public void budgetManagementInsert(BudgetManagementDTO dto);
	public List<BudgetManagementDTO> budgetManagementSelectAll();
	public BudgetManagementDTO budgetManagementSelectOne(String budgetId);
	public void budgetManagementUpdate(BudgetManagementDTO dto);
	public void budgetManagementDelete(String budgetId);
	
}
