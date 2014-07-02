package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.ifms.agenda.dao.DaoInstituicao;
import br.edu.ifms.agenda.dao.impl.DaoInstituicaoImpl;
import br.edu.ifms.agenda.model.Instituicao;

@Controller
public class InstituicaoController {
	
	private final Result result;
	@Inject
	private DaoInstituicao instituicao;
	
	/** 
	* @deprecated CDI eyes only 
	*/  
	public InstituicaoController() {  
	    this(null);  
	} 
	
	@Post("/instituicao")
	public void salvar(Instituicao i){
		instituicao.salvar(i);
		result.redirectTo(this).index();
	}
	
	@Inject
	public InstituicaoController(Result result) {
		this.result = result;
	}

	@Get("/instituicao")
	public void index(){
		
	}
	
	@Get("/instituicao/cadastrar")
	public void cadastrar(){
		
	}
}