package myWeddingFlow.command;

import java.sql.Date;

import lombok.Data;

@Data
public class PlannerCommand {
	String plannerNum;
	String plannerId;
	String plannerName;
	String plannerEmail;
	String plannerPassword;
	String plannerPasswordCon;
	String plannerAddress;
	String plannerAddressDetail;
	String plannerPostcode;
	String plannerPhone1;
	String plannerPhone2;
	Date plannerJoinDate;
	String plannerProfileImage;
	Date plannerBirth;
}


