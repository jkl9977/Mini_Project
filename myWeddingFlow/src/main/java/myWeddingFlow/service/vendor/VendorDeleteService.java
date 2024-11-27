package myWeddingFlow.service.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myWeddingFlow.mapper.vendor.VendorMapper;

@Service
public class VendorDeleteService {
	@Autowired
	VendorMapper vendorMapper;
	
	public void execute(String vendorNum) {
		vendorMapper.vendorDelete(vendorNum);
		
	}

}
