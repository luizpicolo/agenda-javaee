package br.edu.ifms.Dao;

import java.io.Serializable;

public interface DAO <T, PK extends Serializable>{
	public T salvar(T obj);
}
