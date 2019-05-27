package com.lorenzo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lorenzo.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	// Crea una instancia en el momento en que se necesite
	@Autowired
	private IPersonaRepo repo;
	
	// Define una ruta y ejecutara el metodo definido aqui
	@GetMapping("/greeting")
	public String greeting( @RequestParam( name="name", required=false, defaultValue="World" ) String name, Model model ) {
		
		//Persona persona = new Persona();
		 //persona.setId( 4 );
		 //persona.setNombre( "Nombre Persona Apellido" );
		 //repo.save( persona );
		
		model.addAttribute( "name", name );
		// Regresa una vista con el nombre greeting
		return "greeting";
	}
	
	@GetMapping( "/listar" )
	public String greeting( Model model ) {
		// Logica
		model.addAttribute("personas", repo.findAll() );
		
		// System.out.print( repo.findAll() );
		
		return "greeting";
	}
}
