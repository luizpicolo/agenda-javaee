package br.edu.ifms.Dao;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.model.Aluno;
import br.edu.ifms.agenda.utils.JPAUtil;

public class DaoAluno {

	private EntityManager em;

	public DaoAluno() {
		this.em = new JPAUtil().getEntityManager();
	}

	public Aluno salvar(Aluno aluno){
		this.em.getTransaction().begin();
		this.em.persist(aluno);
		this.em.getTransaction().commit();
		
		return aluno;
	}

}
