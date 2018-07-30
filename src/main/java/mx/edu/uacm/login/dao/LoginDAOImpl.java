package mx.edu.uacm.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import mx.edu.uacm.login.model.Usuario;

@Repository
public class LoginDAOImpl implements LoginDAO {

	private static final Logger log=LogManager.getLogger(LoginDAOImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Usuario getByEmailAndPassword(String email, String password) {
		log.debug("Entrando a getByEmailAndPassword");
		Usuario u;
		try {
			u = (Usuario) em.createNativeQuery("SELECT * FROM USUARIO WHERE EMAIL= :correo AND PASSWORD= MD5(:contrasena)", Usuario.class)
			.setParameter("correo", email).setParameter("contrasena", password);
		}catch(NoResultException ex) {
			u=null;
		}
		
		
		return u;
	}

}
