package com.lorenzo.reporitory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.lorenzo.DemoConsolaApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger( DemoConsolaApplication.class );
	
	// Se implementa la interfaz
	@Override
	public void registrar( String nombre ) {
		
		LOG.info( "Se dio de baja a: " + nombre );
	}
	
}