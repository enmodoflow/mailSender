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
        return "send_mail_view";
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("subject") String subject, @RequestParam("body") String body){

        String message = body +"\n\n Datos de contacto: " + "\nNombre: " + name + "\nE-mail: " + mail;
        mailService.sendMail("envioemail2020@gmail.com", "fotospimpam@gmail.com", subject,message);

        return "send_mail_view";
    }
    
    
    
}
