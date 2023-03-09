package com.xworkz.road.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { BeanConfiguration.class };
		
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}
	

}
