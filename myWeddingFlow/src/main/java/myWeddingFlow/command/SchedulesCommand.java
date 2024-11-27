package myWeddingFlow.command;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class SchedulesCommand {
	String scheduleId;
	String memberId;
	String scheduleSubject;
	String scheduleContents;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate scheduleDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate startTime;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate endTime;
	String scheduleLocation;
	String scheduleStatus;
}
