package br.edu.ifms.agenda.utils;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@ApplicationScoped
public class JPAUtil {
	@Produces 
	@ApplicationScoped
	public EntityManagerFactory getEMFactory(){
		Logger l = Logger.getLogger("br.edu.ifms.projeto.utils");
		l.info("Criando uma EntityManagerFactory ...");
		
		return Persistence.createEntityManagerFactory("projeto");
	}
	
	@Produces 
	@RequestScoped
	public EntityManager getEntityManager(EntityManagerFactory factory){
		Logger l = Logger.getLogger("br.edu.ifms.projeto.utils.JPAUtil");
		l.info("Criando um EntityManager ...");
		
		return factory.createEntityManager();
	}
	
	public void closeConnection(@Disposes EntityManagerFactory manager){
		manager.close();
	}
}
