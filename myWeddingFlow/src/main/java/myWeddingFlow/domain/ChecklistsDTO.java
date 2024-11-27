package myWeddingFlow.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
@Alias("checklistsDTO")
public class ChecklistsDTO {
	String checklistId;
	String memberId;
	String checklistSubject;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate goalDate;
	String checklistContents;
	String isCompleted;
}
