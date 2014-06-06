package br.edu.ifms.agenda.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class ProfessorController {
	
	private final Result result; 
	
	@Inject
	public ProfessorController(Result result) {
		this.result = result;
	}

	@Path("/professor")
	public void professor() {
		result.include("welcome", "Seja bem vindo, meu jovem!");
	}
}