package myWeddingFlow.service.vendor;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import myWeddingFlow.command.VendorCommand;
import myWeddingFlow.domain.VendorDTO;
import myWeddingFlow.mapper.VendorMapper;

@Service
public class VendorWriteService {
	@AutoConfigureOrder
	VendorMapper VendorMapper;

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
		dto.setVendorPassword(vendorCommand.getVendorPassword());
		dto.setVendorPhone(vendorCommand.getVendorName());
		dto.setVendorPostcode(vendorCommand.getVendorPostcode());
		
	}
}
