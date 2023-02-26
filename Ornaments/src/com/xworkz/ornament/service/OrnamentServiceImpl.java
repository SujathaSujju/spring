package com.xworkz.ornament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ornament.dto.OrnamentDto;
import com.xworkz.ornament.repo.OrnamentRepo;
import com.xworkz.ornament.repo.OrnamentRepoImpl;

@Component
public class OrnamentServiceImpl implements OrnamentService{

	@Autowired
	private OrnamentRepo repo;
	
//	OrnamentRepo repo = new OrnamentRepoImpl();
	
	@Override
	public boolean save(OrnamentDto dto) {
      if(dto!=null) {
    	  System.out.println("data sending to repo");
    	  return repo.save(dto);
      }
		
		return false;
	}

	@Override
	public List<OrnamentDto> read() {
		
		return repo.read();
	}

	@Override
	public boolean findByShopName(String shopname) {
      if(shopname.length()>2) {
    	  return repo.findByShopName(shopname);
        }
		return false;
	}

	@Override
	public boolean updateweightByName(int weight, String name) {
       if(name!=null) {
    	   return repo.updateweightByName(weight, name);
    	   
       }
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
       
		return repo.deleteByName(name);
	}


	
}
