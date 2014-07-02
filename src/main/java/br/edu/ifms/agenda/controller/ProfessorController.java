package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class ProfessorController {	
	private final Result result; 
	
	/** 
	* @deprecated CDI eyes only 
	*/  
	public ProfessorController() {  
	    this(null);  
	} 
	
	@Inject
	public ProfessorController(Result result) {
		this.result = result;
	}

	@Path("/professor")
	public void index() {
		
	}
	
	@Path("/professor/cadastrar")
	public void cadastrar() {
		
	}
}