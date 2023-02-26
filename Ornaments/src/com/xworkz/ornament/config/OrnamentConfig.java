package com.xworkz.ornament.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.ornament.service.OrnamentService;

@Configuration
@ComponentScan("com.xworkz.ornament")
public class OrnamentConfig {
	
	public OrnamentConfig() {
		System.out.println("OrnamentConfig");
	}
	

}
