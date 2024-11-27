package myWeddingFlow.domain;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("plannerDTO")
public class PlannerDTO {
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
