package myWeddingFlow.command;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ChecklistsCommand {
	String checklistId;
	String memberId;
	String checklistSubject;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate goalDate;
	String checklistContents;
	String isCompleted;
}
