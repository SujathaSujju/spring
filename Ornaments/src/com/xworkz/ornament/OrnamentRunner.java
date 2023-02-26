package com.xworkz.ornament;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.ornament.config.OrnamentConfig;
import com.xworkz.ornament.dto.OrnamentDto;
import com.xworkz.ornament.service.OrnamentService;
import com.xworkz.ornament.service.OrnamentServiceImpl;

public class OrnamentRunner {
	
	
	public static void main(String[] args) {
		
//		OrnamentService service = new OrnamentServiceImpl();
		
		
		OrnamentDto dto1 = new OrnamentDto("GoldRing", 50000, 20, "24k", "whitehouse");
		
		OrnamentDto dto2 = new OrnamentDto("Earring", 60000, 25, "22k", "pearl");
		
		OrnamentDto dto3 = new OrnamentDto("Braclet", 70000, 30, "21k", "prabhatVision");
		
		OrnamentDto dto4 = new OrnamentDto("chain", 80000, 35, "20k", "malabar");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(OrnamentConfig.class);
		
		OrnamentService service = context.getBean(OrnamentServiceImpl.class);
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
		
//		System.out.println(service.read());
		
//		System.out.println(service.findByShopName("whitehouse"));
		
//		System.out.println(service.updateweightByName(40, "chain"));
		
		System.out.println(service.deleteByName("Earring"));
		
		
		
		 
		
		
	}
}
