package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class InstituicaoController {
	private final Result result; 
	
	/** 
	* @deprecated CDI eyes only 
	*/  
	public InstituicaoController() {  
	    this(null);  
	} 
	
	@Inject
	public InstituicaoController(Result result) {
		this.result = result;
	}

	@Path("/instituicao")
	public void instituicao() {
		result.include("welcome", "Seja bem vindo, meu jovem!");
	}
}