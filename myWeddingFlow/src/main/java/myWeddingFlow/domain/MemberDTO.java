package myWeddingFlow.domain;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("memberDTO")
public class MemberDTO {
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
