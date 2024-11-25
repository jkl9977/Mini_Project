package myWeddingFlow.mapper;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.VendorDTO;

@Mapper
public interface VendorMapper {

	public void vendorInsert(VendorDTO dto);
	
	public VendorDTO vendorSelectOne(String vendorNum);

	public void vendorUpdate(VendorDTO dto);
	
	public void vendorDelete(String vendorNum);
	

}
