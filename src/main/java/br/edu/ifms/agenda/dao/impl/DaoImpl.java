package br.edu.ifms.agenda.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.edu.ifms.agenda.dao.DAO;

public abstract class DaoImpl<T, I extends Serializable> implements DAO<T,I>{
	private EntityManager manager;
	
	public DaoImpl(EntityManager manager){
		this.manager = manager;
	}

	@Override
	public T salvar(T entidade) {
		manager.getTransaction().begin();
		T obj = manager.merge(entidade);
		manager.getTransaction().commit();
		
		return obj; 
	}

	@Override
	public void remover(T entidade) {
		manager.getTransaction().begin();
		manager.remove(entidade);
		manager.getTransaction().commit();
	}

	@Override
	public T buscarPorId(Class<T> classe, I pk) {
		try{
			return manager.find(classe, pk);
		}catch(NoResultException e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<T> listar(Class<T> classe) {
		TypedQuery<T> q = manager.createQuery("select obj from " + classe.getSimpleName() + " as obj", classe);
		
		return q.getResultList();
	}
	
	
}
