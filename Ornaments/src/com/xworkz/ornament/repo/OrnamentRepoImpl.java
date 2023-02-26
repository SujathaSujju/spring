package com.xworkz.ornament.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.xworkz.ornament.dto.OrnamentDto;

@Component
public class OrnamentRepoImpl implements OrnamentRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public boolean save(OrnamentDto dto) {
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
//			em.merge(dto);
		
			em.getTransaction().commit();
			
			System.out.println("data saved in repo :"+dto);
			//System.out.println(dto);
			return true;
		}
		
		return false;
	}


	@Override
	public List<OrnamentDto> read() {
		if(em!=null) {
			em.getTransaction().begin();
			 Query query = em.createNamedQuery("read",OrnamentDto.class);
			 em.getTransaction().commit();
			 return query.getResultList();
			 
		}
		return null;
	}


	@Override
	public boolean findByShopName(String shopname) {
        if(em!=null) {
        	em.getTransaction().begin();
        	Query query = em.createNamedQuery("findByShopName",OrnamentDto.class);
        	query.setParameter("sn", shopname);
        	em.getTransaction().commit();
        	System.out.println(query.getResultList());
        	return true;
        	
        }
		return false;
	}


	@Override
	public boolean updateweightByName(int weight, String name) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateweightByName");
			query.setParameter("wg", weight);
			query.setParameter("nm", name);
			System.out.println(query.executeUpdate());
			em.getTransaction().commit();
			
			return true;
			
		}
		return false;
	}


	@Override
	public boolean deleteByName(String name) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			System.out.println(query.executeUpdate());
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	
}
