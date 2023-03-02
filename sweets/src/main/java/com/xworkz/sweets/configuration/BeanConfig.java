package com.xworkz.sweets.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.sweets")
@EnableWebMvc
public class BeanConfig implements WebMvcConfigurer {
	
	public BeanConfig() {
		System.out.println("bean configuration is started");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "Home.jsp");
	}

}
