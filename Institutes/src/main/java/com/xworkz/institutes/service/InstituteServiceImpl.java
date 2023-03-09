package com.xworkz.institutes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.institutes.dto.InstituteDto;
import com.xworkz.institutes.repo.InstituteRepo;
import com.xworkz.institutes.repo.InstituteRepoImpl;

@Component
public class InstituteServiceImpl implements InstituteService{

	public InstituteServiceImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Autowired
	private InstituteRepo repo;

	@Override
	public String save(InstituteDto dto, Model model) {
		if(dto!=null && dto.getName().length()>3) {
		String result =	repo.save(dto);
		if(result!=null) {
			
			model.addAttribute("Result", "data saved successfully");
			return "Success";
			
		}
		model.addAttribute("Result", "data not saved");
		return "Home";
		}
		model.addAttribute("Result2", "data is not valid");
		return "Home";
	}

}
