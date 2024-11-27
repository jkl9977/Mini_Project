package myWeddingFlow.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Alias("schedulesDTO")
public class SchedulesDTO {
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
