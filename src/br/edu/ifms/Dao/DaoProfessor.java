package br.edu.ifms.Dao;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.model.Professor;
import br.edu.ifms.agenda.utils.JPAUtil;

public class DaoProfessor {

	private EntityManager em;

	public DaoProfessor() {
		this.em = new JPAUtil().getEntityManager();
	}

	public Professor salvar(Professor professor){
		this.em.getTransaction().begin();
		this.em.persist(professor);
		this.em.getTransaction().commit();
		
		return professor;
	}

}
