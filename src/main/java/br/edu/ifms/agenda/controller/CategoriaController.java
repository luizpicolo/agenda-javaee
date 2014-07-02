package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class CategoriaController {
	private final Result result;
	
	/** 
	* @deprecated CDI eyes only 
	*/  
	public CategoriaController() {  
	    this(null);  
	} 
	
	@Inject
	public CategoriaController(Result result) {
		this.result = result;
	}

	@Path("/categoria")
	public void index() {
		
	}
	
	@Path("/categoria/cadastrar")
	public void cadastrar() {
		
	}
}