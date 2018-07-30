package mx.edu.uacm.login.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import mx.edu.uacm.login.model.Usuario;

@Controller
public class LoginController {

	private static final Logger log = LogManager.getLogger(LoginController.class);
	
	
	
	
	@PostMapping("/login")
	private String login(Map<String, Object> model, Usuario usuario) {
		
		return null;
		
	}
}



