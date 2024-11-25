package myWeddingFlow.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("vendorDTO")
@Data
public class VendorDTO {
	String vendorNum ; 
	String vendorId;                     
	String vendorPassword ;  
	String vendorPasswordCon ;              
	String vendorName    ;                 
	String registrationNumber ;   //사업자등록번호
	String representativeName  ;  //대표자 이름          
	String vendorMainImage ; //이미지 나중에 처리
	String vendorAddress ;                 
	String vendorAddressDetail   ;        
	String vendorPostcode ;         
	String category ;  
	String vendorPhone;                   
	String vendorEmail ; 
}
