package com.xworkz.road.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.road.dto.RoadDto;
import com.xworkz.road.service.RoadService;

@Component
@RequestMapping("/")
public class RoadController {
  
    @Autowired
	public RoadService service;
	
    @RequestMapping("/SignUp")
	public String save(@RequestParam("name") String name,
			            @RequestParam("length") String length,
			            @RequestParam("from") String from,
			            @RequestParam("to") String to,Model model) {
		
		RoadDto dto = new RoadDto(name, length, from, to);
		System.out.println(dto);
		return service.save(dto, model);
//		return "Success";
		
	}
    
}
