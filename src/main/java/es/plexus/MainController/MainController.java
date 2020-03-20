package es.plexus.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import es.plexus.Services.MailSenderServices;



@Controller
public class MainController {

    @Autowired
    private MailSenderServices mailService;

    @GetMapping("/")
    public String index(){
        return "envio";
    }
    

	@RequestMapping("/registro")
	public String registro(
			@RequestParam("nombre") String nombre,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("pais") String dni,
			@RequestParam("cp") String cp,

			Model model) {
		String emailOk = email + "@gmail.com";
		return "inicio";

	}

	@RequestMapping("/login")
	public String login(
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model) {

		return "login";
	}
    
    
    @PostMapping("/envio")
    public String sendMail(@RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("subject") String subject, @RequestParam("body") String body){

        String message = body +"\n\n Datos de contacto: " + "\nNombre: " + name + "\nE-mail: " + mail;
        String emailOk = mail + "@gmail.com";
        mailService.sendMail("envioemail2020@gmail.com", emailOk, subject,message);

        return "envio";
    }
}
