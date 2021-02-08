package lk.wixis360.EmailSender.controller;

import lk.wixis360.EmailSender.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private SendEmail sendEmail;


  @DeleteMapping(params = {"id"})
     public void trigger (@RequestParam String id) {
        String ID =  id ;
        sendEmail.SendingEmail(ID, "Test mail", "test");
       }

    }

