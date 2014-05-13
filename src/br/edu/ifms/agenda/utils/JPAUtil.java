package br.edu.ifms.agenda.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf;
	
	public JPAUtil(){
		this.emf = Persistence.createEntityManagerFactory("agenda-mysql");
	}
	
	public EntityManager getEntityManager(){
		return this.emf.createEntityManager();				
	}
}
