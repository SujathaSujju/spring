package com.xworkz.dress;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DressRunner {

	public static void main(String[] args) {
		
		ApplicationContext Context = new AnnotationConfigApplicationContext(DressConfig.class);
		
		Dress dress = Context.getBean(Dress.class);
		dress.type();
		
	}
}
