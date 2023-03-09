package com.xworkz.road.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.road.dto.RoadDto;

@Component
public class RoadService {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	
	EntityManager em = emf.createEntityManager();
	
	public String save(RoadDto dto,Model model) {
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			model.addAttribute("successMessage", "data saved successfully");
			return "Success";
		}
		model.addAttribute("failMessage", "data is not saved");
		return "Success";
		
	}
}
