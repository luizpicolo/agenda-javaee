package br.edu.ifms.agenda.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Usuario {
	@OneToMany(mappedBy="professor")
	private List<Tarefa> tarefas;

	
	/* Getters e Setters */
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}
