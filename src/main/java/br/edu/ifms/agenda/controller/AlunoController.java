package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class AlunoController {
	private final Result result;
	
	/** 
	* @deprecated CDI eyes only 
	*/  
	public AlunoController() {  
	    this(null);  
	} 
	
	@Inject
	public AlunoController(Result result) {
		this.result = result;
	}

	@Path("/aluno")
	public void aluno() {
		result.include("welcome", "Seja bem vindo, meu jovem!");
	}
}