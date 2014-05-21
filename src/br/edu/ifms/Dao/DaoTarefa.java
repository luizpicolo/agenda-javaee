package br.edu.ifms.Dao;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.model.Tarefa;
import br.edu.ifms.agenda.utils.JPAUtil;

public class DaoTarefa {

	private EntityManager em;

	public DaoTarefa() {
		this.em = new JPAUtil().getEntityManager();
	}

	public Tarefa salvar(Tarefa tarefa){
		this.em.getTransaction().begin();
		this.em.persist(tarefa);
		this.em.getTransaction().commit();
		
		return tarefa;
	}

}
