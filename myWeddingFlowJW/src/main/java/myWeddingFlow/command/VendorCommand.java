package myWeddingFlow.command;

import lombok.Data;

@Data
public class VendorCommand {

		String vendorNum ; 
		String vendorId;                     
		String vendorPassword ;                
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
