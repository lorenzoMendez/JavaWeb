package com.lorenzo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lorenzo.model.Usuario;
												// Entidad,  LlavePrimaria 
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
		
}