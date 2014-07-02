package br.edu.ifms.agenda.dao.impl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.ifms.agenda.dao.DaoInstituicao;
import br.edu.ifms.agenda.model.Instituicao;

public class DaoInstituicaoImpl extends DaoImpl<Instituicao, Long> implements DaoInstituicao{
	@Inject
	public DaoInstituicaoImpl(EntityManager manager) {
		super(manager);
	}	
}