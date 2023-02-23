package com.xworkz.dress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dress {

	@Autowired
	public Colour colour;
	
	public void type() {
		
		System.out.println("Anarkali dress");
		
		colour.DressColour();
	}
}
