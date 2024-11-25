package myWeddingFlow.mapper;

import org.apache.ibatis.annotations.Mapper;

import myWeddingFlow.domain.VendorDTO;

@Mapper
public interface VendorMapper {

	public int vendorInsert(VendorDTO dto);

}
