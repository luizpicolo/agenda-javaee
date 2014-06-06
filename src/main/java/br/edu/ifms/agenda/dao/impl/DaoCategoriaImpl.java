package br.edu.ifms.agenda.dao.impl;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.dao.DaoCategoria;
import br.edu.ifms.agenda.model.Categoria;

public class DaoCategoriaImpl extends DaoImpl<Categoria, Long> implements DaoCategoria{

	public DaoCategoriaImpl(EntityManager manager) {
		super(manager);
	}
}
