package com.xworkz.institutes.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.institutes.dto.InstituteDto;

@Component
public interface InstituteService {

	public String save(InstituteDto dto,Model model);
	
	
}
