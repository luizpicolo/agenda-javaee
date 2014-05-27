package br.edu.ifms.agenda.dao.impl;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.dao.DaoProfessor;
import br.edu.ifms.agenda.model.Professor;

public class DaoProfessorImpl extends DaoImpl<Professor, Long> implements DaoProfessor{

	public DaoProfessorImpl(EntityManager manager) {
		super(manager);
	}	
}
