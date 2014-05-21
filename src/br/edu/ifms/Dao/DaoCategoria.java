package br.edu.ifms.Dao;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.model.Categoria;
import br.edu.ifms.agenda.utils.JPAUtil;

public class DaoCategoria {

	private EntityManager em;

	public DaoCategoria() {
		this.em = new JPAUtil().getEntityManager();
	}

	public Categoria salvar(Categoria categoria){
		this.em.getTransaction().begin();
		this.em.persist(categoria);
		this.em.getTransaction().commit();
		
		return categoria;
	}

}
