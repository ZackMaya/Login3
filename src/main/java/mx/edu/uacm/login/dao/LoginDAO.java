package mx.edu.uacm.login.dao;

import mx.edu.uacm.login.model.Usuario;

public interface LoginDAO {
	
	Usuario getByEmailAndPassword(String email, String password);

}
