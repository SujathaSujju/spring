package com.xworkz.fruits.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	public FrontControllerConfiguration() {
		System.out.println("this is from FrontController Configuration");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
