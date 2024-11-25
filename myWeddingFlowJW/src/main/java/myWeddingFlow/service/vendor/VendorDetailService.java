package myWeddingFlow.service.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myWeddingFlow.domain.VendorDTO;
import myWeddingFlow.mapper.VendorMapper;

@Service
public class VendorDetailService {
	@Autowired
	VendorMapper vendorMapper;
	public void execute(Model model,String vendorNum) {
		VendorDTO dto=vendorMapper.vendorSelectOne(vendorNum);
		model.addAttribute("dto", dto);
		
		
	}
	
}

