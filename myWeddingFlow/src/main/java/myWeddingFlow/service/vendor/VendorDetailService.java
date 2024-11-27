package myWeddingFlow.service.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import myWeddingFlow.domain.AuthInfoDTO;
import myWeddingFlow.domain.VendorDTO;
import myWeddingFlow.mapper.vendor.VendorMapper;

@Service
public class VendorDetailService {
	@Autowired
	VendorMapper vendorMapper;
	public void execute(Model model,HttpSession session) {
		AuthInfoDTO auth=(AuthInfoDTO)session.getAttribute("auth");
		String vendorNum=vendorMapper.vendorNumSelect(auth.getUserId());
		VendorDTO dto=vendorMapper.vendorSelectOne(vendorNum);
		System.out.println(dto);
		model.addAttribute("dto", dto);
		
		
		
	}
	
}

