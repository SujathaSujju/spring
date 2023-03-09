package com.xworkz.institutes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.institutes.dto.InstituteDto;
import com.xworkz.institutes.service.InstituteService;

@Component
@RequestMapping("/")
public class InstituteController {

	@Autowired
	private InstituteService service;
	
	public InstituteController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/Home")
	public String save(InstituteDto dto,Model model) {
		System.out.println(dto);
		model.addAttribute("name", dto.getName());
		return service.save(dto, model);
		
	}
	
}
