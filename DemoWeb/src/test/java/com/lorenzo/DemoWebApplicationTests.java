package com.lorenzo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.lorenzo.model.Usuario;
import com.lorenzo.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebApplicationTests {

	@Autowired
	public IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Usuario usuario = new Usuario();
		usuario.setId( 1 );
		usuario.setNombre( "lorenzo" );
		usuario.setClave( encoder.encode( "secret" ) );
		Usuario retorno = repo.save( usuario );
		// Prueba unitaria
		assertTrue( retorno.getClave().equalsIgnoreCase( usuario.getClave() ) );
	}

}
