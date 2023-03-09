package com.xworkz.institutes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBConfig {

	public DBConfig() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		System.out.println("created bean of entity manager");
		LocalEntityManagerFactoryBean localbean=new LocalEntityManagerFactoryBean();
		localbean.setPersistenceUnitName("databaseProperties");
		return localbean;
		
	}
	
}
