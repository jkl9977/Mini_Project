package myWeddingFlow.command;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberCommand {
	String memberNum;
	String memberId;
	String memberName;
	String memberEmail;
	String memberPassword;
	String memberPasswordCon;
	String memberAddress;
	String memberAddressDetail;
	String memberPostcode;
	String memberPhone1;
	String memberPhone2;
	Date memberJoinDate;
	String memberProfileImage;
	Date memberBirth;
}


