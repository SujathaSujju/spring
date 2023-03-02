package com.xworkz.sweets.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SweetController {

	public SweetController() {
		System.out.println("sweeet controller is started");
	}
	
	@RequestMapping("/success")
	public String save() {
		return "success.jsp";
	}
}
