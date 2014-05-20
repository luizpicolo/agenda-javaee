package br.edu.ifms.agenda.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String descricao;
	private int visibilidade;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataTermino;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Professor professor;
	
	@ManyToMany
	private List<Aluno> alunos;
	
	
	/* Getters e Setters */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(int visibilidade) {
		this.visibilidade = visibilidade;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
