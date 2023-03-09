package com.xworkz.institutes.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.institutes.dto.InstituteDto;

@Component
public class InstituteRepoImpl implements InstituteRepo {

	
	public InstituteRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Autowired
	public EntityManagerFactory entityManagerFactory;

	@Override
	public String save(InstituteDto dto) {
		if(entityManagerFactory!=null) {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return "Success";
			
		}
		return null;
	}
	
	
	
}
