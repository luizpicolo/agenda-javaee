package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class TarefaController {
	private final Result result; 
	
	/** 
	* @deprecated CDI eyes only 
	*/  
	public TarefaController() {  
	    this(null);  
	} 
	
	@Inject
	public TarefaController(Result result) {
		this.result = result;
	}

	@Path("/tarefa")
	public void tarefa() {
		result.include("welcome", "Seja bem vindo, meu jovem!");
	}
}