package br.edu.ifms.agenda.model;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.utils.JPAUtil;

public class Teste {

	public static void main(String[] args) {
		/* Criação da EntitiManager em */
		EntityManager em = new JPAUtil().getEntityManager();
		
		/* Cria Instituições */
		Instituicao ifms = new Instituicao();
		
		ifms.setNome("IFMS");		
		
		em.getTransaction().begin();
			em.persist(ifms);
		em.getTransaction().commit();
	}

}
