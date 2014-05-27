package br.edu.ifms.agenda.dao.impl;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.dao.DaoInstituicao;
import br.edu.ifms.agenda.model.Instituicao;

public class DaoInstituicaoImpl extends DaoImpl<Instituicao, Long> implements DaoInstituicao{

	public DaoInstituicaoImpl(EntityManager manager) {
		super(manager);
	}
	
}