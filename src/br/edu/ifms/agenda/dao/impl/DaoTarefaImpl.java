package br.edu.ifms.agenda.dao.impl;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.dao.DaoTarefa;
import br.edu.ifms.agenda.model.Tarefa;

public class DaoTarefaImpl extends DaoImpl<Tarefa, Long> implements DaoTarefa{

	public DaoTarefaImpl(EntityManager manager) {
		super(manager);
	}	
}
