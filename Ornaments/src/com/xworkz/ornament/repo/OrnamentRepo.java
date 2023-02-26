package com.xworkz.ornament.repo;

import java.util.List;

import com.xworkz.ornament.dto.OrnamentDto;

public interface OrnamentRepo {

	public boolean save(OrnamentDto dto);
	
	public List<OrnamentDto> read();
	
    public boolean findByShopName(String shopname);
	
	public boolean updateweightByName(int weight,String name);
	
	public boolean deleteByName(String name);
}
