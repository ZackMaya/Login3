package mx.edu.uacm.login.test.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.edu.uacm.login.LoginApplication;
import mx.edu.uacm.login.dao.LoginDAO;
import mx.edu.uacm.login.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=LoginApplication.class)
public class LoginDAOImplTest {
	
	private static final Logger log=LogManager.getLogger(LoginDAOImplTest.class);
	
	@Autowired
	private LoginDAO loginDAO;
	
	@Test
	public void testLogin() {
		log.debug("Entrando a testLogin");
		Usuario usuario = loginDAO.getByEmailAndPassword("kriztianfv97@gmail.com", "12345");
		
		Assert.assertThat(usuario, is(not(nullValue())));
		
	}

}
