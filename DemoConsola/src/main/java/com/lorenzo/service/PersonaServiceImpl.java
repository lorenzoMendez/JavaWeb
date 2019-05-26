package com.lorenzo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lorenzo.reporitory.IPersonaRepo;
import com.lorenzo.reporitory.PersonaRepoImpl1;

@Service
public class PersonaServiceImpl implements IPersonaService {

	// Automaticamente busca una instancia
	@Autowired
	// Se especifica un cualificador a ciertas implementaciones
	// @Qualifier("persona2")
	@Qualifier("persona2")
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		/// Debido a la anotacion @Service ya no se necesita la instancia siguiente
		// repo = new PersonaRepoImpl();
		repo.registrar(nombre);
	}

}
