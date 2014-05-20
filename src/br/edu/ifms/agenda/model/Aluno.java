package br.edu.ifms.agenda.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Aluno extends Usuario {
	
	@ManyToMany(mappedBy="alunos")
	private List<Tarefa> tarefas;

	
	/* Getters e Setters */
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}
