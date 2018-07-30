package mx.edu.uacm.login.test.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.edu.uacm.login.LoginApplication;
import mx.edu.uacm.login.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=LoginApplication.class)
public class UsuarioTest {


	private static final Logger log=LogManager.getLogger(UsuarioTest.class);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void testGuardarUsuario() {
		log.debug("Entrando a testGuardarUsuario");
		
		Usuario u = new Usuario();
		
		u.setEmail("kriztianfv97@gmail.com");
		u.setPassword("12345");
		
		em.persist(u);
	}

}
