package es.plexus.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.plexus.Services.MailSenderServices;



@Controller
public class MainController {

	
	@Autowired
	private MailSenderServices servicio;
	
	
	@GetMapping("/")
	public String registro() {
			
		return "index";
	}
	
	
	@RequestMapping("/registro")
	public String registro(
			@RequestParam("nombre") String nombre,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("pais") String dni,
			@RequestParam("pais") String cp,
			
			Model model) {
		return "inicio";
		
	}
	
	@RequestMapping("/login")
	public String login(
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model) {
		
		return "login";
	}
	
	}
	