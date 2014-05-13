package br.edu.ifms.agenda.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String descricao;	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataTermino;	
	
	private int visibilidade;
	private Categoria categoria;	
	private Usuario usuario;
	
	
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
	
	public int getVisibilidade() {
		return visibilidade;
	}
	
	public void setVisibilidade(int visibilidade) {
		this.visibilidade = visibilidade;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
