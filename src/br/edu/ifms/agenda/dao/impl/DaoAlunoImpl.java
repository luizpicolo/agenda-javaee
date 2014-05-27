package br.edu.ifms.agenda.dao.impl;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.dao.DaoAluno;
import br.edu.ifms.agenda.model.Aluno;

public class DaoAlunoImpl extends DaoImpl<Aluno, Long> implements DaoAluno{

	public DaoAlunoImpl(EntityManager manager) {
		super(manager);
	}	
}
