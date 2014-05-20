package br.edu.ifms.agenda.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.edu.ifms.agenda.utils.JPAUtil;

public class Teste {

	public static void main(String[] args) {
		/* Criação da EntitiManager em */
		EntityManager em = new JPAUtil().getEntityManager();

		/* Cria Instituições */
		Instituicao instituicao = new Instituicao();

		instituicao.setNome("IFMS");

		em.getTransaction().begin();
		em.persist(instituicao);
		em.getTransaction().commit();

		// Cria professor
		Professor professor = new Professor();
		professor.setNome("Evandro");
		professor.setInstituicao(instituicao);

		em.getTransaction().begin();
		em.persist(professor);
		em.getTransaction().commit();

		// Cria aluno
		Aluno aluno = new Aluno();
		aluno.setNome("PacoBoy");
		aluno.setInstituicao(instituicao);

		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		
		// Cria Categoria
		Categoria categoria = new Categoria();
		categoria.setTitulo("Gerencia de Projetos");
		
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();

		// Cria tarefa
		Tarefa tarefa = new Tarefa();
		tarefa.setTitulo("Trabalho do Dinho");
		tarefa.setDescricao("Copa do mundo");
		tarefa.setDataInicio(new GregorianCalendar(2014, 11, 12, 10, 00, 00));
		tarefa.setDataTermino(new GregorianCalendar(2014, 11, 12, 12, 00, 00));
		tarefa.setCategoria(categoria);
		tarefa.setProfessor(professor);
		
		em.getTransaction().begin();
		em.persist(tarefa);
		em.getTransaction().commit();
	}

}
