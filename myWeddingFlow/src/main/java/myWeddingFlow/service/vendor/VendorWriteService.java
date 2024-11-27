package myWeddingFlow.service.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.VendorCommand;
import myWeddingFlow.domain.VendorDTO;
import myWeddingFlow.mapper.vendor.VendorMapper;

@Service
public class VendorWriteService {
	@Autowired
	VendorMapper vendorMapper;
	//@Autowired
	//PasswordEncoder passwordEncoder;

	public void execute(VendorCommand vendorCommand) {
		VendorDTO dto=new VendorDTO();
		dto.setCategory(vendorCommand.getCategory());
		dto.setRegistrationNumber(vendorCommand.getRegistrationNumber());
		dto.setRepresentativeName(vendorCommand.getRepresentativeName());
		dto.setVendorAddress(vendorCommand.getVendorAddress());
		dto.setVendorAddressDetail(vendorCommand.getVendorAddressDetail());
		dto.setVendorEmail(vendorCommand.getVendorEmail());
		dto.setVendorId(vendorCommand.getVendorId());
		//dto.setVendorMainImage(vendorCommand.getVendorMainImage());
		dto.setVendorName(vendorCommand.getVendorName());
		dto.setVendorNum(vendorCommand.getVendorNum());
		
		//비밀번호 암호화
		//String  encodePw=passwordEncoder.encode(memberCommand.getVendorPassword());
		//dto.setVendorPassword(encodePw);
		dto.setVendorPassword(vendorCommand.getVendorPassword());
		
		dto.setVendorPhone(vendorCommand.getVendorName());
		dto.setVendorPostcode(vendorCommand.getVendorPostcode());
		vendorMapper.vendorInsert(dto);
		//System.out.println(i+"개 업체 등록 완료");
		
	}
}
