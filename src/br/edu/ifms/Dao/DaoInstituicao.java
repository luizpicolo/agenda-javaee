package br.edu.ifms.Dao;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.model.Instituicao;
import br.edu.ifms.agenda.utils.JPAUtil;

public class DaoInstituicao {
	
	private EntityManager em;

	public DaoInstituicao() {
		this.em = new JPAUtil().getEntityManager();
	}

	public Instituicao salvar(Instituicao instituicao){
		this.em.getTransaction().begin();
		this.em.merge(instituicao);
		this.em.getTransaction().commit();
		return instituicao;
	}
}
