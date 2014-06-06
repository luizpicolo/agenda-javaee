package br.edu.ifms.agenda.dao;

import java.io.Serializable;
import java.util.List;

public interface DAO <T, L extends Serializable>{
	public T salvar(T entidade);
	public void remover(T entidade);
	public T buscarPorId(Class<T> entidade, L pk);
	public List<T> listar(Class<T> classe);
}
